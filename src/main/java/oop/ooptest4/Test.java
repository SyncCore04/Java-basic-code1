package oop.ooptest4;

public class Test extends Dog {
    /*
    小狗有属性：姓名、年龄。
    行为：吃骨头
    实现以下需求
    要求1：小狗的年龄：0~15岁
    要求2：打印小狗所有的信息：小白，2岁
    要求3：调用吃骨头的方法打印效果：2岁的小白，正在吃骨头
     */
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("小白");
        d1.setAge(10);

        System.out.println(d1.getName()+" "+d1.getAge()+"岁");
        d1.eat();

    }
}
