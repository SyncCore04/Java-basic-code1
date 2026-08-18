package oopadvanced.finaltest;

public class Circle {
    private final double PI=3.14;
    private double radius;

//    public void setPI(double PI) {
//        this.PI = PI;
//    }
    //错误

    public Circle(){
        //空构造方法
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public double getArea(){
        return PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*PI*radius;
    }
}
