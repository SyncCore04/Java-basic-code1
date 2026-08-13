package oop.ooptest3;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name="小白";
        t1.age=23;

        //调用方法
        System.out.println(t1.name);
        System.out.println(t1.age);
        
        t1.teach();
        t1.eat();
        t1.sleep();

    }
}