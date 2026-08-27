package oopinterface.test1;

public class Test {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("小舞", "黄色");
        System.out.println(rabbit.getName()+"是"+rabbit.getColor()+"的");
        rabbit.eat();

        System.out.println("-----------------");

        Frog frog = new Frog("小青", "绿色");
        System.out.println(frog.getName()+"是"+frog.getColor()+"的");
        frog.eat();
        frog.swim();

        System.out.println("-----------------");

        Dog dog = new Dog("小鸡毛", "黄色");
        System.out.println(dog.getName()+"是"+dog.getColor()+"的");
        dog.swim();
        dog.eat();
    }
}
