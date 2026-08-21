package oopadvanced.extenddemo.demo1;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("1001", "张三", 5000, 1000);
        System.out.println(manager.getName()+manager.getId()+"号的工资为"+(manager.getBonus()+manager.getSalary())+"元");
        manager.work();
        manager.eat();

        System.out.println("-----------------");

        Cooker cooker = new Cooker("1002", "李四", 3000);
        System.out.println(cooker.getName()+cooker.getId()+"号的工资为"+cooker.getSalary()+"元");
        cooker.work();
        cooker.eat();
    }
}
