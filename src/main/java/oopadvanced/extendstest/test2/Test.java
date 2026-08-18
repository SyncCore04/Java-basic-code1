package oopadvanced.extendstest.test2;

public class Test {
    public static void main(String[] args) {
        Android android = new Android();

        android.brand="XiaoMi 15 Ultra";
        android.price=9999.0;

        System.out.println(android.brand+"\t"+android.price+"￥");
        android.call();
        android.sendMessage();
        android.nfc();

        System.out.println("-----------------");

        iPhone iPhone = new iPhone();
        iPhone.brand="iPhone 18 Pro Max";
        iPhone.price=12999.0;

        System.out.println(iPhone.brand+"\t"+iPhone.price+"￥");
        iPhone.call();
        iPhone.sendMessage();

        System.out.println("-----------------");

        Laptop laptop = new Laptop();
        laptop.brand="Apple MacBook Pro";
        laptop.price=19999.0;
        System.out.println(laptop.brand+"\t"+laptop.price+"￥");
        laptop.code();
    }
}


