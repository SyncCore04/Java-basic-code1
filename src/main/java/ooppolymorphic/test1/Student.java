package ooppolymorphic.test1;

public class Student extends User {

    public Student() {
    }

    public Student(String name, String account, String password) {
        super(name, account, password);
    }

    @Override
    public String getRole() {
        return "同学";
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
}
