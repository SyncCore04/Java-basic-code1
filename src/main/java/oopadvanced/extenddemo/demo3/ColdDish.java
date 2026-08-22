package oopadvanced.extenddemo.demo3;

public class ColdDish extends Dish {
    private int shelfLife;

    @Override
    public void introduce() {
        System.out.println("凉菜" + getName() + "，价格" + (int)getPrice() + "元，口味" + getTaste() + "，保质期" + shelfLife + "分钟，适合所有食客");
    }


    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }
}
