package ooppolymorphic.test3;

public class Test {
    /*
    自行车Bicycle:
        属性：品牌，行驶速度
        行为：移动move，响铃ringBell（）
    汽车Car:
        属性：品牌，行驶速度
        行为：移动move，鸣笛honk（）
    人Person:
        属性：名字，年龄，性别
        行为：行驶交通工具（能使用所有交通工具）
    测试类中创建Person的对象，让这个使用任意一款交通工具

    */
    public static void main(String[] args) {
        Person p=new Person("张三",18,"男");

        System.out.println(p.getName()+"是"+p.getGender()+"性年龄"+p.getAge()+"岁");
        System.out.println("他可以使用所有交通工具");
        System.out.println("----------");

        p.drive(new Bicycle("TREK",15));
        System.out.println("----------");
        p.drive(new Car("奔驰",100));

    }
}
