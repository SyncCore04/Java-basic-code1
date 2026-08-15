package oop.opptest7;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("空参构造方法被调用");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study(){
        System.out.println(name+"正在学习");
    }

    public void eat(){
        System.out.println(name+"正在吃饭");
    }

    public void sleep() {
        System.out.println(name + "正在睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
