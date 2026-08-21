package oopadvanced.extendstest.test6;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("父类的空参构造执行了");
    }

    public Person(String name, int age) {
        System.out.println("父类的有参构造执行了");
        this.name = name;
        this.age = age;
    }
}
