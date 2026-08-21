package oopadvanced.extendstest.test7;

public class Teacher extends Person {
    private String subject;

    public Teacher() {

    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach(){
        System.out.println("我在教学");
    }
}
