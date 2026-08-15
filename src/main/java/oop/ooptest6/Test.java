package oop.ooptest6;

public class Test {
    // 定义一个 Javabean 类描述学生
    // 属性：姓名、年龄、性别、身高
    public static void main(String[] args) {

        Student s=new Student();
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getGender());
        System.out.println(s.getHeight());

        Student s2=new Student("张三",18,"男",180);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getGender());
        System.out.println(s2.getHeight());
    }
}
