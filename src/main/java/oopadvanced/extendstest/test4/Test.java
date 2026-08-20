package oopadvanced.extendstest.test4;

public class Test {
    public static void main(String[] args) {
        /*
        第一代手机：打电话
        第二代手机：打电话，发短信
        第三代手机：打电话升级为打视频，发短信，打游戏
         */
        FirstGenerationPhone phone1=new FirstGenerationPhone();
        System.out.println("第一代手机:");
        phone1.call();

        System.out.println("-----------------");

        SecondGenerationPhone phone2=new SecondGenerationPhone();
        System.out.println("第二代手机");
        phone2.call();
        phone2.send();

        System.out.println("-----------------");

        ThirdGenerationPhone phone3=new ThirdGenerationPhone();
        System.out.println("第三代手机:");
        phone3.call();
        phone3.send();
        phone3.play();
    }
}
