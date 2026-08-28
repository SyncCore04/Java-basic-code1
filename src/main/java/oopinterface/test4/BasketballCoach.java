package oopinterface.test4;

public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void coach() {
        System.out.println("篮球教练在教如何打篮球");
    }
}
