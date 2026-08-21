package oopadvanced.extendstest.test7;

public class GeneralTeacher extends Teacher {
    public GeneralTeacher() {
    }

    public GeneralTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    @Override
    public void teach() {
        System.out.println("正在教学一般课程");
    }
}
