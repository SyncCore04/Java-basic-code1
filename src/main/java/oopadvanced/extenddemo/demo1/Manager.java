package oopadvanced.extenddemo.demo1;

public class Manager extends Employee {
    double bonus;

    public Manager() {
    }

    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public void work(){
        System.out.println("经理"+name+"正在进行管理工作");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
