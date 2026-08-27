package ooppolymorphic.test4;

public class Test {
    /*
        猫类：
            属性：名字，颜色
            行为：猫吃鱼，猫抓老鼠，喝水
        狗类：
            属性：名字，颜色
            行为：狗吃骨头，狗看家，喝水
     */

    public static void main(String[] args) {
        Cat cat = new Cat("小白", "黄色");
        System.out.println(cat.getName()+"是"+cat.getColor()+"的");
        cat.eat();
        cat.catchMouse();
        cat.drink();

        System.out.println("-----------------");

        Dog dog = new Dog("小鸡毛", "黄色");
        System.out.println(dog.getName()+"是"+dog.getColor()+"的");
        dog.eat();
        dog.lookHome();
        dog.drink();
    }

    //抽象方法：将子类的方法实现出来，但是不实现具体的内容
    //子类必须实现抽象方法，否则会报错
}
