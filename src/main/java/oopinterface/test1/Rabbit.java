package oopinterface.test1;

public class Rabbit extends Animal{
    public Rabbit() {
    }

    public Rabbit(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "兔子在吃胡萝卜");
    }
}
