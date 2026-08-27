package ooppolymorphic.test4;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "在吃骨头");
    }

    public void lookHome() {
        System.out.println(getName() + "在看家");
    }

}
