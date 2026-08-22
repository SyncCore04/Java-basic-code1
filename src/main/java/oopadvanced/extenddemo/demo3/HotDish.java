package oopadvanced.extenddemo.demo3;

public class HotDish extends Dish {
    private int cookingTime;

    @Override
    public void introduce() {
        System.out.println("热菜" + getName() + "，价格" + (int)getPrice() + "元，口味" + getTaste() + "，烹饪时间" + cookingTime + "分钟，适合重口味食客");
    }


    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }
}
