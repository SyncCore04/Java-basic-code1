package oop.ooptest5;

public class Student {
    /**
     * 学生有属性：姓名、年龄、身高、体重。
     * 行为：学习。
     */
    private String name;
    private int age;
    private int height;
    private int weight;

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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void study(){
        System.out.println(name+"正在学习");
    }
}
