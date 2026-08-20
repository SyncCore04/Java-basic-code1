package oopadvanced.extendstest.test5;

public class SmartDevice {
    private String name;
    private double price;

    public SmartDevice() {
    }

    public SmartDevice(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculatePrice(){
        if(price>=0&&price<1000){
            return price;
        }
        else if (price>=1000&&price<5000){
            return price*0.9;
        }
        else if (price>=5000&&price<10000){
            return price*0.8;
        }
        else if(price>=10000){
            return price*0.7;
        }
        else{
            return 0;
        }
    }
}
