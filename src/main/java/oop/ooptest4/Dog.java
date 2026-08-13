package oop.ooptest4;

public class Dog {
    private String name;
    private int age;

    //get/set
    //value 传递的参数
    public void setName(String value) {
        //给对象中的属性赋值
        name=value;
    }

    public String getName() {
        return name;
    }

    public void setAge(int value) {
        if(value>=0&&value<=15){
            age=value;
        }
        else{
            System.out.println("年龄范围错误");
        }
    }

    public int getAge() {
        return age;
    }

    public void eat(){
        System.out.println(name+"正在吃骨头");
    }
}