package oop.ooptest5;

//set设置属性值，get获取属性值
public class Test {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setHeight(175);
        s1.setWeight(60);
        System.out.println(s1.getName()+"的年龄是"+s1.getAge()+"岁，身高是"+s1.getHeight()+"cm，体重是"+s1.getWeight()+"kg");
        s1.study();

        //长胖5kg
        //方式1,通过set方法设置体重(修改属性值)
        s1.setWeight(s1.getWeight()+5);
        //方式2,通过get方法取值后再加5赋值给新变量，不改变属性值
        int newWeight=s1.getWeight()+5;

        System.out.println(s1.getName()+"的体重是"+s1.getWeight()+"kg(方式1呈现)");
        System.out.println(s1.getName()+"的体重是"+newWeight+"kg(方式2呈现)");

        //减肥3kg，身高增加2cm
        s1.setWeight(s1.getWeight()-3);
        s1.setHeight(s1.getHeight()+2);
        System.out.println("大三后:");
        System.out.println(s1.getName()+"减肥成功，体重是"+s1.getWeight()+"kg，身高是"+s1.getHeight()+"cm");

        //大四毕业后，打印学生的所有信息
        System.out.println("大四后:");
        s1.setAge(s1.getAge()+4);
        System.out.println(s1.getName()+"的年龄是"+s1.getAge()+"岁，身高是"+s1.getHeight()+"cm，体重是"+s1.getWeight()+"kg");
    }
}
