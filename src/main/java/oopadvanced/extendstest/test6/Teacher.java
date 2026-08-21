package oopadvanced.extendstest.test6;

public class Teacher extends Person {
    String subject;

    //子类的构造方法：先调用父类的空参构造方法
    //再调用子类的构造方法
    //如果子类没有构造方法，子类的构造方法默认调用父类的空参构造方法
    public Teacher() {
        System.out.println("子类Teacher的空参构造执行了");
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;

        System.out.println("子类Teacher的有参构造执行了");
    }
}
