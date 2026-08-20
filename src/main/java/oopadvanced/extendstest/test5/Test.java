package oopadvanced.extendstest.test5;

public class Test {
    /*
    某电商项目售卖智能设备，智能设备包括：手机，笔记本电脑，平板。
    1，所有的智能设备有以下属性：商品名，商品价格
    行为：计算商品总价格：
        [0~1000）元，不打折
        [1000~5000 )元，9折
        [ 5000~10000 ) 元，8折
        10000元及以上，7折
    2，手机享受额外补贴，在原有的基础上基础打9折。
    3，笔记本电脑和平板电脑没有不享受额外补贴。
     */
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setName("小米15");
        phone.setPrice(5999);
        System.out.println(phone.calculatePrice());

        System.out.println("-----------------");

        Laptop laptop = new Laptop();
        laptop.setName("MacBook Pro");
        laptop.setPrice(14999);
        System.out.println(laptop.calculatePrice());

        System.out.println("-----------------");

        Pad pad = new Pad();
        pad.setName("iPad Pro");
        pad.setPrice(15999);
        System.out.println(pad.calculatePrice());
    }
}
