package ooppolymorphic.practice1;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //行为：使用图像，打印图形信息，并打印计算结果
    //注意：这里的参数类型是父类 Shape，这就是多态的核心
    public void useShape(Shape shape){
        System.out.println("学生 [" + name + "] 年龄 [" + age + "] 正在使用工具：");
        System.out.println("使用的图形是: " + shape.getType());
        System.out.println("它的周长为: " + shape.getPerimeter());
        System.out.println("它的面积为: " + shape.getArea());
        System.out.println("---------------------------------");
    }
}
