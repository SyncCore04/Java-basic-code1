package oopadvanced.finaltest;

public class FinalTest2 {
    /*
        定义一个Javabean类，描述一个圆
        属性：半径和圆周率
        方法：计算圆的面积和周长
     */
    public static void main(String[] args) {
        Circle c = new Circle(1.5);
        //c.setPI(3.1415926);   //错误
        System.out.println(c.getRadius());
        System.out.println(c.getPI());

        System.out.println(String.format("%.2f",c.getArea()));
        System.out.println(String.format("%.2f",c.getPerimeter()));


    }


}
