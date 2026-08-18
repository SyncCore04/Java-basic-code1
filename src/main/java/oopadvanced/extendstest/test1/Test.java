package oopadvanced.extendstest.test1;

public class Test {
    public static void main(String[] args) {
        //创建一个学生对象
        Student s1=new Student();
        s1.name="小白";
        s1.age=18;
        s1.grade="高三";

        System.out.println(s1.name+"在"+s1.grade+"学习,今年"+s1.age+"岁");

        s1.eat();
        s1.study();

        System.out.println("-----------------");

        //创建老师的对象
        Teacher t1=new Teacher();
        t1.name="张鸿跃";
        t1.age=30;
        t1.subject="数学";
        System.out.println(t1.name+"在"+s1.grade+t1.subject+"教学,今年"+t1.age+"岁");
        t1.teach();
    }
}
