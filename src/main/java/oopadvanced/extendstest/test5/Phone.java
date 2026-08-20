package oopadvanced.extendstest.test5;

public class Phone extends SmartDevice {
    @Override
    public double calculatePrice() {
        return super.calculatePrice() * 0.9;
    }
}
