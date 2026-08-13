package oop.ooptest3;

public class Teacher {
    //属性
    String name;
    int age;

    //方法(行为)
    public void teach() {
        System.out.println("我是" + name + "，正在授课");
    }
    public void eat(){
        System.out.println("我是"+name+"，我正在吃饭");
    }
    public void sleep(){
        System.out.println("我是"+name+"，我正在睡觉");
    }
}
