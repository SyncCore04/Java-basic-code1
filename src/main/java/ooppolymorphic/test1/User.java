package ooppolymorphic.test1;

public class User {
    private String name;
    private String account;
    private String password;

    public User() {
    }

    public User(String name, String account, String password) {
        this.name = name;
        this.account = account;
        this.password = password;
    }

    // 角色描述，子类重写返回对应身份（同学/老师/管理员）
    public String getRole() {
        return "用户";
    }

    // 工作方法，子类重写
    public void work() {
        System.out.println("正在工作");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
