package ooppolymorphic.test1;

public class Admin extends User {

    public Admin() {
    }

    public Admin(String name, String account, String password) {
        super(name, account, password);
    }

    @Override
    public String getRole() {
        return "管理员";
    }

    @Override
    public void work() {
        System.out.println("管理员的工作是管理网站");
    }
}
