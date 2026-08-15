package oop.opptest7;

public class Test {
    /*
        定义一个 Javabean 类描述学生
            属性：姓名、年龄
            行为: 学习、吃饭、睡觉
     */
    public static void main(String[] args) {
        Student s=new Student();

        //空参构造方法调用
        System.out.println(s.getName());
        System.out.println(s.getAge());

        s.setName("张三");
        s.setAge(18);

        System.out.println(s.getName());
        System.out.println(s.getAge());

        s.study();
        s.eat();
        s.sleep();

        //全部参数构造方法调用
        Student s2=new Student("李四",20);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());

        s2.study();
        s2.eat();
        s2.sleep();
    }
}
