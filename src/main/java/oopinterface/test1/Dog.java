package oopinterface.test1;

public class Dog extends Animal implements Swim {
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void swim() {
        System.out.println(getName() + "狗在狗刨");
    }

    @Override
    public void eat() {
        System.out.println(getName() + "狗在吃骨头");
    }
}
