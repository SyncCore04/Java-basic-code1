package oopinterface.test3;

public class Person {

    private String name;
    private int age;
    // 构造方法
    public Person() {
    }
    // 有参构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //get()和set()方法
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
    // 行为：吃饭、睡觉
    public void eat(){
        System.out.println("我在吃饭");
    }
    public void sleep(){
        System.out.println("我在睡觉");
    }

    public void show(){
        System.out.println("姓名：" + name + "，年龄：" + age);
    }


}
