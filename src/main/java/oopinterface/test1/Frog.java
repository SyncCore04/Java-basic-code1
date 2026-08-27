package oopinterface.test1;

public class Frog extends Animal implements Swim {
    public Frog() {
    }

    public Frog(String name, String color) {
        super(name, color);
    }

    @Override
    public void swim() {
        System.out.println(getName() + "青蛙在游泳");
    }

    @Override
    public void eat() {
        System.out.println(getName() + "青蛙在吃虫子");
    }
}
