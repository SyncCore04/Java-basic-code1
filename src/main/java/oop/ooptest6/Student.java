package oop.ooptest6;

public class Student {
    private String name;
    private int age;
    private String gender;
    private int height;

    //构造方法
    //习惯：空参
    public Student(){
        System.out.println("空参构造方法被调用");
    }

    //习惯：带全部参数的构造
    public Student(String name,int age,String gender,int height){
        System.out.println("带全部参数的构造方法被调用");
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.height=height;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
