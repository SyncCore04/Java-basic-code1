package oopadvanced.finaltest;

public class FinalTest {
    public static void main(String[] args) {
        /*
            final修饰的变量：常量
            特点：
            1.必须在定义时赋值
            2.不能被重新赋值
         */
        final int NUM=100;
        //NUM=200;//错误，不能被重新赋值
        System.out.println(NUM+100);

        //2.使用常量
        final Student STU = new Student("张三",18);
        //final修饰STU，修饰的是内存地址，对象内的属性值可以改变
        //STU=new Student("李四",20);//错误，不能被重新赋值
        System.out.println(STU.getName());

        STU.setName("李四");
        STU.setAge(20);

        System.out.println(STU.getName());
        System.out.println(STU.getAge());

    }
}
