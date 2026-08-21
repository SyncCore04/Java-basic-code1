package oopadvanced.extendstest.test7;

public class Student extends Person {
    String grade;

    public Student() {
    }

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void study(){
        System.out.println("我在学习");
    }
}
