package ooppolymorphic.test3;

public class Bicycle extends Vehicle {
    public Bicycle() {
    }

    public Bicycle(String brand, double speed) {
        super(brand, speed);
    }

    @Override
    public void move(){
        System.out.println(getBrand()+"自行车正在以"+getSpeed()+"km/h的速度移动");
    }

    public void ringBell(){
        System.out.println(getBrand()+"自行车正在响铃Ring Ring Ring");
    }
}
