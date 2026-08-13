package oop.ooptest2;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="杜佳乐";
        s1.gender='男';
        s1.age=22;
        s1.weight=70.5;
        s1.height=1.80;
        
        System.out.println(s1.name);
        System.out.println(s1.gender);
        System.out.println(s1.age);
        System.out.println(s1.weight);
        System.out.println(s1.height);
    }
}
