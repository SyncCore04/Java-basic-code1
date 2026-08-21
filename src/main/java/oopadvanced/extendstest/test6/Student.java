package oopadvanced.extendstest.test6;

public class Student extends Person {
    String grade;

    public Student() {
        System.out.println("子类的空参构造执行了");
    }

    public Student(String name, int age, String grade) {
        //父类中的属性：通过super（参数）的形式传递给父类的构造方法
        super(name, age);
        this.grade = grade;

        System.out.println("子类Student的有参构造执行了");
    }
}
