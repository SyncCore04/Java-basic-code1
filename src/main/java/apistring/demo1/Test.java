package apistring.demo1;

import java.util.Random;
//本包的类无需导包
//java.long无需导包
//其余类需导包

public class Test {
    public static void main(String[] args) {
        Random r = new Random();

        double num1=r.nextDouble();//0.0-0.999999999999之间
        System.out.println(num1);

        double num2 = r.nextDouble(20);//0.0-20.0之间,取左不取右
        System.out.println(num2);

        for (int i = 0; i < 100; i++) {
            double num3 = r.nextDouble(15,20);//15.0-20.0之间,取左不取右
            System.out.println(num3);
        }
    }
}
