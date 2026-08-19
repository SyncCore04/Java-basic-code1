package oopadvanced.extendstest.test3;

public class Test {
    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.ziShow();
    }
}

class Fu{
    String name="fu";
    String address="beijing";
}

class Zi extends Fu{
    String name="zi";
    String address="shanghai";

    public void ziShow(){
        String name="ziShow";

        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        System.out.println(super.address);

    }
    //书写规则：抽取共性
    //访问特点：就近原则
    //name局部位置，this.本类，super.父类
}
