package ooppolymorphic.test1;

public class Teacher extends User {

    public Teacher() {
    }

    public Teacher(String name, String account, String password) {
        super(name, account, password);
    }

    @Override
    public String getRole() {
        return "老师";
    }

    @Override
    public void work() {
        System.out.println("老师的工作是教书");
    }
}
