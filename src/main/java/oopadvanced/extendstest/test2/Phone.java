package oopadvanced.extendstest.test2;

public class Phone extends SmartDevice {
    // 属性：品牌(brand)、价格(price)（继承自父类）
    // 行为：打电话(call)、发短信(sendMessage)

    public void call() {
        System.out.println("正在利用手机打电话");
    }

    public void sendMessage() {
        System.out.println("正在利用手机发短信");
    }
}
