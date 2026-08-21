package oopadvanced.extendstest.test6;

public class Test {
    public static void main(String[] args) {
        Student stu=new Student("张三",18,"高一");
        System.out.println(stu.name+stu.age+stu.grade);

        System.out.println("-----------------");

        Teacher tea=new Teacher("李四",30,"数学");
        System.out.println(tea.name+tea.age+tea.subject);

    }
}
