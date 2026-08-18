package oopadvanced.extendstest.test1;

public class Teacher extends Person {//继承自Person类
    //写子类特有内容
    //属性：科目
    String subject;

    //方法：教学
    public void teach(){
        System.out.println("教师在教学");
    }
}
