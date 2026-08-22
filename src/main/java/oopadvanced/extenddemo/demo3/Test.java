package oopadvanced.extenddemo.demo3;

public class Test {
    public static void main(String[] args) {
        HotDish hotDish = new HotDish();

        hotDish.setName("红烧肉");
        hotDish.setPrice(28);
        hotDish.setTaste("鲜甜咸香");
        hotDish.setCookingTime(40);
        hotDish.introduce();

        System.out.println("-----------------");

        ColdDish coldDish = new ColdDish();

        coldDish.setName("白切鸡");
        coldDish.setPrice(30);
        coldDish.setTaste("鲜甜咸香");
        coldDish.setShelfLife(45);
        coldDish.introduce();

    }
}
