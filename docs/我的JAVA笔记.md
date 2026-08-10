# 我的JAVA学习笔记

## 数组遍历
**💡小彩蛋：快捷键生成**

在 IDEA 里，输入数组名后敲 .for 回车，自动补全增强 for：

```Plain Text
arr3.for   → 回车 → 自动生成 for (int num : arr3) { }
arr3.fori  → 回车 → 自动生成普通带下标的 for 循环
```
也不能乱用，增强for循环中，i成了元素，不能通过i来访问索引。

✅适用场景：仅读取元素
打印、求和、找最大最小值、判断是否存在某元素。

❌不适用场景（要用普通 for）
需要下标；修改数组元素；倒序遍历；按条件跳过部分元素。

> 在[MethodDemo3.java](/src/main/java/method/MethodDemo3.java)中，踩过一次坑，通过增强for循环中的i进行索引访问。

**错误案例：**
```java
public static void printArray(int[] arr) {

    for (int i : arr) {
        if (i == 0)
            System.out.print("[" + arr[i]);
        else if (i == arr.length - 1)
            System.out.print(arr[i] + "]");
        else
            System.out.print(arr[i] + ",");
    }
}
```


## 方法重载（Overload）
> 同一个类中，多个方法**方法名相同**，参数列表不同。

### 构成重载条件
1. ✅ 方法名必须一致
2. ✅ **参数列表必须不同**：参数个数、类型、顺序不一样
3. ❌ **和返回值类型无关**，不能依靠返回值区分重载
4. ❌ 和修饰符无关

### 调用规则
- 编译器根据**实参的个数、数据类型**自动匹配对应的重载方法。
- 当出现多个匹配方法时，编译器会报错。案例：[MethodDemo4.java](/src/main/java/method/MethodDemo4.java)

### 示例
```java
public static double getSum(int a,int b){}
public static double getSum(int a,double b){}
```

### 易错
仅改返回值，不算重载，直接编译报错。


## 输出
### String.format()
1. 作用：格式化字符串，返回新字符串，不直接打印
2. `%.2f`：浮点数保留2位小数，默认四舍五入
3. 返回类型是String，**不能参与算术运算，仅用于输出展示**
4. 对比：printf直接控制台输出；format得到字符串对象
> 案例：[MethodPractice01.java第34行](/src/main/java/method/MethodPractice01.java)


## 快慢指针
### 核心思想
- **快指针(fast)**：负责遍历数组，筛选符合条件的元素
- **慢指针(slow)**：负责记录有效元素存放的下标位置
- 原地修改数组，**不创建新数组**，节省内存

### 执行逻辑
1. fast逐个扫描全部元素
2. 满足条件 → 将`nums[fast]`赋值给`nums[slow]`，`slow++`
3. 不满足条件 → fast继续前进，直接跳过
4. 最终`slow`的值 = 有效元素个数

### ⚠️关键注意点
1. 数组**物理长度不会改变**，只是把有效数据搬运到数组头部
2. 数组后半段会残留旧数据，**只读取前slow个元素**
3. 返回值为slow，不是数组length

### 典型题目
- 移除元素
- 删除有序数组重复项

```java
//模板
public static int getslow(int[] nums) {
    int slow = 0;
    for (int fast = 0; fast < nums.length; fast++) {
        if (符合条件) {
            nums[slow] = nums[fast];
            slow++;
        }
    }
    return slow;
}
```
**练习案例:**
[RemoveElement.java](/src/main/java/algorithm/RemoveElement.java)
