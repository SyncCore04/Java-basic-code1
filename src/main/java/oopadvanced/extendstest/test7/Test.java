package oopadvanced.extendstest.test7;

public class Test {
    public static void main(String[] args) {
        BachelorStudent bs=new BachelorStudent("小白", 18, "本科一年级");
        System.out.println(bs.getName()+bs.getAge()+"岁"+bs.getGrade());
        bs.eat();
        bs.sleep();
        bs.study();

        System.out.println("-----------------");

        MasterStudent ms=new MasterStudent("小红", 22, "硕士一年级");
        System.out.println(ms.getName()+ms.getAge()+"岁"+ms.getGrade());
        ms.eat();
        ms.sleep();
        ms.study();

    }
}
