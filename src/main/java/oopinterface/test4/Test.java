package oopinterface.test4;

public class Test {
    public static void main(String[] args) {
        //创建一个乒乓球教练
        PingPangCoach pingPangCoach = new PingPangCoach("张三", 30);
        System.out.println(pingPangCoach.getName()+pingPangCoach.getAge()+"岁");
        pingPangCoach.coach();
        pingPangCoach.speakEnglish();

        System.out.println("-----------------");

        //创建一个篮球运动员
        BasketballCoach basketballCoach = new BasketballCoach("李四", 35);
        System.out.println(basketballCoach.getName()+basketballCoach.getAge()+"岁");
        basketballCoach.coach();

    }
}
