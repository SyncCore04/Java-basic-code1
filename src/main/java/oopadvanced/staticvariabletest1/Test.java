package oopadvanced.staticvariabletest1;

public class Test {
    /*
        学生有如下属性：姓名，年龄，老师
        一个班级中，所有学生都是共享同一个老师
        第一名学生：小诗诗，19岁
        第二名学生：小丹丹，20岁
        最初都是小雯老师上课，有一天小丹丹申请换老师，换成了张鸿跃老师
        利用static模拟上述效果
    */
    public static void main(String[] args) {
        Student stu1=new Student();
        Student.teacherName="小雯老师";

        stu1.name="小诗诗";
        stu1.age=19;
        System.out.println(stu1.name+stu1.age+"岁的老师是："+stu1.teacherName); //输出前还未更改，所以是小雯老师


        Student stu2=new Student();
        stu2.teacherName="张鸿跃老师"; //所有成员的老师都变成了张鸿跃老师

        stu2.name="小丹丹";
        stu2.age=20;


        System.out.println(stu2.name+stu2.age+"岁的老师是："+stu2.teacherName);
        System.out.println(stu1.name+stu1.age+"岁的老师是："+stu1.teacherName);

    }
}
