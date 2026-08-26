package ooppolymorphic.test2;

import java.sql.SQLOutput;

public class Zi extends Fu {
    String name="zi";

    //zi方法独有
    public void ziShow(){
        System.out.println("zi类的show方法被调用了");
    }

    @Override
    public void show(){
        System.out.println("zi类的重写方法被调用了");
    }
}
