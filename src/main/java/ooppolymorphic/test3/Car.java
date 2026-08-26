package ooppolymorphic.test3;

public class Car extends Vehicle {
    public Car() {
    }

    public Car(String brand, double speed) {
        super(brand, speed);
    }

    @Override
    public void move(){
        System.out.println(getBrand()+"汽车正在以"+getSpeed()+"km/h的速度移动");
    }

    public void honk(){
        System.out.println(getBrand()+"汽车正在鸣笛 bar bar bar");
    }
}
