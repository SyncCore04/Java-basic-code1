package oop.ooptest1;

public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog();//创建一个对象
        d1.name="小白";
        d1.age=18;
        d1.weight=50.5;
        d1.color="白色";

        Dog d2= new Dog();
        d2.name="小鸡毛";
        d2.age=3;
        d2.weight=5.5;
        d2.color="老抽色";

        //获取信息
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.weight);
        System.out.println(d1.color);

        System.out.println(d2.name);
        System.out.println(d2.age);
        System.out.println(d2.weight);
        System.out.println(d2.color);

    }
}
