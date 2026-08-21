package oopadvanced.extendstest.test7;

public class MajorStudent extends Teacher {
    public MajorStudent() {
    }

    public MajorStudent(String name, int age, String subject) {
        super(name, age, subject);
    }

    @Override
    public void teach() {
        System.out.println("正在教学专业课程");
    }
}
