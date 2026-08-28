package oopinnerclass.demo2;

public class Test {
    public static void main(String[] args) {
        //调用下面的GoSwimming方法

        //传统方式进行调用
        Student s = new Student();
        GoSwimming(s);

        //匿名内部类
        GoSwimming(new Swim() {
            @Override
            public void swim() {
                System.out.println("学生在游泳");
            }

        });
    }


    //调用这个方法的时候，调用Swim接口的swim方法
    public static void GoSwimming(Swim s){
        s.swim();
    }
}