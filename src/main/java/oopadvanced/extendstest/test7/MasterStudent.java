package oopadvanced.extendstest.test7;

public class MasterStudent extends Student {
    public MasterStudent() {
    }

    public MasterStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println("硕士研究生在攻读硕士学位");
    }

    @Override
    public void sleep() {
        System.out.println("硕士研究生在豪华宿舍睡觉");
    }
}
