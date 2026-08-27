package ooppolymorphic.test4;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "在吃鱼");
    }

    public void catchMouse() {
        System.out.println(getName() + "在抓老鼠");
    }

}
