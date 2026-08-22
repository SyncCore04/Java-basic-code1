package ooppolymorphic.test1;

public class StudentManagementSystem {

    // 多态核心：参数类型是父类 User，可以接收 Student / Teacher / Admin
    public void register(User user) {
        System.out.println("姓名为" + user.getName() + "的" + user.getRole()
                + "注册成功，账号" + user.getAccount() + "，密码" + user.getPassword());
        user.work();
    }
}
