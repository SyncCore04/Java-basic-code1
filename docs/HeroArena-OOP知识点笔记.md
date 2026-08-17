# HeroArena 项目知识点笔记（OOP 初学者版）

> 本笔记基于 HeroArena（英雄竞技场）小项目，逐点讲解 Java 面向对象核心知识。
> 建议配合源码一起看，源码传送门：[HeroArena 项目源码](src/main/java/com/heroarena)

---

## 目录

1. [项目结构概览](#1-项目结构概览)
2. [类与对象](#2-类与对象)
3. [封装](#3-封装)
4. [继承（extends）](#4-继承extends)
5. [抽象类（abstract）](#5-抽象类abstract)
6. [方法重写（@Override）](#6-方法重写override)
7. [多态（核心难点）](#7-多态核心难点)
8. [ArrayList 泛型集合](#8-arraylist-泛型集合)
9. [异常处理（try-catch）](#9-异常处理try-catch)
10. [Scanner 与 Random](#10-scanner-与-random)
11. [访问修饰符](#11-访问修饰符)
12. [知识点全景图](#12-知识点全景图)
13. [学习建议](#13-学习建议)

---

## 1. 项目结构概览

```
HeroArena/
└── src/
    └── com/
        └── heroarena/
            ├── Hero.java          // 抽象父类（英雄模板）
            ├── Warrior.java       // 战士子类
            ├── Mage.java          // 法师子类
            ├── Assassin.java      // 刺客子类
            └── GameController.java // 游戏主控（含 main 方法）
```

**角色关系**：`Warrior`、`Mage`、`Assassin` 都继承自 `Hero`，`GameController` 负责调度战斗。

---

## 2. 类与对象

### 什么是类？

类是**模板**，描述一类事物共同拥有的属性和行为。

```java
public class Warrior extends Hero {
    // 属性：名字、血量、攻击力（从父类继承）
    // 行为：attack() 攻击方法
}
```

### 什么是对象？

对象是用模板 `new` 出来的**具体实例**。

```java
Hero player = new Warrior("玩家战士");  // new 出来的就是一个对象
```

> 生活类比：`Warrior` 类是"战士图纸"，`new Warrior("张三")` 就是按图纸造出来的一个叫张三的战士。图纸只有一张，但可以造出无数个战士。

### 构造方法

创建对象时自动调用的方法，用于初始化属性。

```java
public Warrior(String name) {
    super(name, 150, 20);  // 调用父类构造方法
}
```

---

## 3. 封装

### 核心思想

把数据藏起来，对外只暴露方法，防止外部乱改。

```java
protected int hp;           // 藏起来，外部不能直接访问

public int getHp() {        // 对外提供读取方法
    return hp;
}
```

### 为什么要封装？

- 防止外部把数据改成非法值（比如血量改成负数）
- 所有修改都走方法，方便在方法里加校验逻辑
- 内部实现变了，外部代码不用改

本项目中 `name`、`hp`、`maxHp`、`baseAttack` 都是 `protected`，子类能直接用，外部必须通过 getter 读取。

---

## 4. 继承（extends）

### 核心思想

子类继承父类后，**自动拥有**父类的属性和方法，不用重复写。

```java
public class Warrior extends Hero {  // Warrior 继承 Hero
    // 自动拥有 name、hp、baseAttack、isAlive()、getHpBar()
    // 只需要写自己特有的 attack() 逻辑
}
```

### 本项目中的继承

共有的东西写在父类 `Hero` 里：
- 属性：`name`、`hp`、`maxHp`、`baseAttack`
- 方法：`isAlive()`、`getHpBar()`、`takeDamage()`、各种 getter

每个子类只写自己不同的部分：
- `Warrior`：暴击攻击逻辑
- `Mage`：魔法灼烧攻击逻辑
- `Assassin`：普通攻击 + 闪避反击

### super 关键字

子类构造方法中调用父类构造方法，必须写在第一行。

```java
public Warrior(String name) {
    super(name, 150, 20);  // 调用 Hero(name, hp, baseAttack)
}
```

> 生活类比：父类 `Hero` 是"英雄"，战士/法师/刺客都是英雄的一种，所以天生就有英雄的所有特征，再加上自己的职业特色。

---

## 5. 抽象类（abstract）

### 核心思想

抽象类是**半成品模板**，不能直接 `new` 对象。它定义"子类必须做什么"，但不规定"怎么做"。

```java
public abstract class Hero {
    public abstract void attack(Hero target);  // 抽象方法，只有声明，没有方法体
}
```

### 为什么用抽象类？

- 所有英雄都能攻击，但每个职业攻击方式不一样
- 父类写不出通用的攻击逻辑 → 声明为抽象方法
- **强制每个子类必须实现它**，不实现就编译报错

### 抽象类的规则

1. 抽象类不能 `new` 对象（`new Hero()` 会报错）
2. 包含抽象方法的类必须声明为 `abstract`
3. 子类继承抽象类后，必须实现所有抽象方法，否则子类也得是抽象类
4. 抽象类里可以有普通方法和属性（本项目的 `isAlive()`、`getHpBar()` 就是普通方法）

> 生活类比：`Hero` 说"所有英雄必须会攻击"，但不教你怎么攻击。战士自己琢磨出暴击，法师自己琢磨出灼烧，刺客自己琢磨出闪避。

---

## 6. 方法重写（@Override）

### 核心思想

子类对父类的方法**重新实现**，运行时用子类的版本。

```java
@Override
public void attack(Hero target) {  // 重写父类的抽象方法
    // 战士自己的暴击逻辑
}
```

### 本项目中的两处重写

| 方法 | 哪些类重写了 | 作用 |
|------|-------------|------|
| `attack()` | Warrior / Mage / Assassin | 每个职业不同的攻击方式 |
| `takeDamage()` | Assassin | 刺客被攻击时有概率闪避反击 |

### @Override 注解的作用

- 告诉编译器"我这是在重写父类方法"
- 如果父类没有这个方法，编译器会报错（防止你写错方法名）
- 不加也能重写，但加上更安全、可读性更好

### 重载 vs 重写（初学者容易搞混）

| | 重载（Overload） | 重写（Override） |
|---|---|---|
| 位置 | 同一个类里 | 子类对父类 |
| 方法名 | 相同 | 相同 |
| 参数列表 | **必须不同** | **必须相同** |
| 本项目 | 未使用 | 大量使用 |

---

## 7. 多态（核心难点）

### 一句话理解

**父类引用指向子类对象，调用方法时自动执行子类的版本。**

### 体现一：父类引用指向子类对象

```java
Hero player = new Warrior("玩家战士");  // 左边 Hero，右边 Warrior
Hero cpu = new Mage("电脑法师");        // 左边 Hero，右边 Mage
```

变量 `player` 的类型是 `Hero`，但它实际指向的是一个 `Warrior` 对象。

### 体现二：ArrayList 统一存储不同子类

```java
ArrayList<Hero> heroList = new ArrayList<>();
heroList.add(player);  // 存 Warrior 对象
heroList.add(cpu);     // 存 Mage 对象
```

一个集合里能放不同职业的对象，因为它们都是 `Hero` 的子类。

### 体现三：动态分派（运行时决定调用谁）

```java
player.attack(cpu);  // 虽然 player 是 Hero 类型，但实际执行 Warrior.attack()
cpu.attack(player);  // 实际执行 Mage.attack()
```

程序**运行时**才根据对象的真实类型决定调用哪个方法，这叫**动态绑定**。编译时只看左边的类型，运行时看右边的实际对象。

### 体现四：方法返回父类类型

```java
private static Hero createHero(int choice, String prefix) {
    switch (choice) {
        case 1: return new Warrior(...);   // 返回子类对象
        case 2: return new Mage(...);
        case 3: return new Assassin(...);
    }
}
```

返回类型写 `Hero`，实际返回具体子类，调用方不需要知道到底是哪个职业。

### 多态的好处

- **统一处理**：用 `Hero` 类型就能操作所有职业，不用为每个职业写一套代码
- **易于扩展**：以后加个"猎人"职业，继承 `Hero` 就行，战斗流程不用改
- **解耦**：`GameController` 只依赖 `Hero`，不依赖具体的 `Warrior`/`Mage`

> 生活类比：遥控器（Hero 引用）能控制电视（Warrior）也能控制空调（Mage），按同一个开关（attack()），电视和空调的反应完全不同。遥控器不需要知道自己控制的是什么，按就完了。

---

## 8. ArrayList 泛型集合

### 基本用法

```java
ArrayList<Hero> heroList = new ArrayList<>();
heroList.add(player);       // 添加元素
heroList.size();            // 获取元素个数
for (Hero h : heroList) {   // 增强 for 循环遍历
    System.out.println(h.getName());
}
```

### 和普通数组的区别

| | 数组 `Hero[]` | ArrayList |
|---|---|---|
| 长度 | 固定，创建时指定 | 可变，自动扩容 |
| 添加元素 | `arr[0] = ...` | `list.add(...)` |
| 获取大小 | `arr.length` | `list.size()` |
| 泛型 | 不涉及 | `<Hero>` 指定元素类型 |

### 泛型 `<Hero>` 是什么？

规定这个集合**只能装 Hero 及其子类对象**，装别的类型编译报错。好处是取出来时不用强制类型转换。

---

## 9. 异常处理（try-catch）

### 为什么需要？

用户可能输入字母而不是数字，直接 `Integer.parseInt("abc")` 会抛 `NumberFormatException`，程序直接崩溃。

### 基本语法

```java
try {
    playerChoice = Integer.parseInt(input);  // 可能出错的代码
} catch (NumberFormatException e) {
    System.out.println("输入无效，请输入数字！");  // 出错后的处理
}
```

### 执行流程

- try 里的代码正常执行 → 跳过 catch，程序继续
- try 里抛出异常 → 跳到 catch 执行，程序不崩溃

### 本项目中的两处异常处理

1. **选英雄时**：输入非数字或不在 1~3 范围内，要求重新输入
2. **下一回合时**：必须输入 1 才继续，其他输入都提示重新输入

```java
while (true) {
    String input = scanner.nextLine().trim();
    try {
        int num = Integer.parseInt(input);
        if (num >= 1 && num <= 3) {
            break;  // 输入合法，跳出循环
        }
        System.out.println("请输入 1、2 或 3：");
    } catch (NumberFormatException e) {
        System.out.println("请输入数字：");
    }
}
```

这是"死循环 + 条件 break"的经典输入校验模式。

---

## 10. Scanner 与 Random

### Scanner（读取控制台输入）

```java
Scanner scanner = new Scanner(System.in);
String input = scanner.nextLine();  // 读取一行输入
```

`nextLine()` 是**阻塞方法**——程序执行到这会停下来等用户敲回车，用户不输入程序就不走。

### Random（生成随机数）

```java
Random rand = new Random();
rand.nextDouble();   // 生成 0.0 ~ 1.0 的小数，用于概率判断
rand.nextInt(3) + 1; // 生成 1 ~ 3 的整数，用于电脑选角
```

### 概率判断技巧

```java
if (rand.nextDouble() < 0.3) {  // 30% 概率触发
    // 暴击
}
```

`nextDouble()` 均匀分布在 0~1 之间，小于 0.3 的概率就是 30%。

本项目中的随机应用：
- 战士 30% 暴击
- 刺客 25% 闪避
- 电脑随机选职业

---

## 11. 访问修饰符

控制属性和方法能被谁访问。

| 修饰符 | 本类 | 同包 | 子类 | 其他包 |
|--------|------|------|------|--------|
| `public` | ✓ | ✓ | ✓ | ✓ |
| `protected` | ✓ | ✓ | ✓ | ✗ |
| （默认不写） | ✓ | ✓ | ✗ | ✗ |
| `private` | ✓ | ✗ | ✗ | ✗ |

本项目用 `protected` 修饰属性，因为：
- 子类（Warrior/Mage/Assassin）需要直接访问 `name`、`hp`
- 但不希望外部类随便修改

---

## 12. 知识点全景图

```
HeroArena 项目
│
├── 面向对象基础
│   ├── 类与对象（new 创建实例）
│   ├── 封装（protected 属性 + getter）
│   ├── 构造方法 + super()
│   └── this 关键字
│
├── 继承与多态（核心重点）
│   ├── extends 继承（子类复用父类）
│   ├── abstract 抽象类 + 抽象方法（强制子类实现）
│   ├── @Override 方法重写（子类改父类方法）
│   └── 多态
│       ├── 父类引用指向子类对象
│       ├── 动态分派（运行时决定调用谁）
│       ├── ArrayList<Hero> 统一存储
│       └── 方法返回父类类型
│
├── 集合框架
│   └── ArrayList + 泛型 + 增强 for
│
├── 异常处理
│   └── try-catch（NumberFormatException）
│
└── 标准库
    ├── java.util.Scanner（控制台输入）
    └── java.util.Random（随机数）
```

---

## 13. 学习建议

### 掌握顺序（由易到难）

1. **类与对象** → 能看懂 `new Warrior(...)` 在干什么
2. **封装** → 理解为什么属性要藏起来，用 getter 访问
3. **继承** → 理解 `extends` 和 `super`，为什么子类能省代码
4. **抽象类** → 理解为什么 `Hero` 不能直接 new，`attack()` 为什么没有方法体
5. **方法重写** → 理解 `@Override` 和父子类方法的关系
6. **多态** → 最难但最重要，搞懂"左边 Hero 右边 Warrior"调用方法时发生了什么
7. **ArrayList / 异常处理 / Scanner / Random** → 工具类，边用边查即可

### 动手练习建议

- 试着加一个新职业（比如"猎人"，血量110，攻击22，每次攻击有20%概率连击两次）
- 给英雄加一个"防御"属性，减少受到的伤害
- 加一个"药水"道具，使用后恢复血量
- 把战斗结果（胜负、回合数）记录下来

### 一句话总结

这个项目虽然只有 5 个文件，但把面向对象三大特性（**封装、继承、多态**）全覆盖了。吃透它，你的 Java OOP 就真正入门了。
