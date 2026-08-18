package oopadvanced.extendstest.test1;

public class Student extends Person {//继承自Person类
    //写子类特有内容
    //属性：年级
    String grade;

    //方法：学习
    public void study(){
        System.out.println("学生在学习");
    }
}
