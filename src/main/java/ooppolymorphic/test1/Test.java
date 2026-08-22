package ooppolymorphic.test1;

public class Test {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();

        // 多态：register 方法参数是 User，实际传入的是子类对象
        Student student = new Student("张三", "zhangsan", "123456");
        system.register(student);

        System.out.println("-----------------");

        Teacher teacher = new Teacher("李老师", "lilaoshi", "654321");
        system.register(teacher);

        System.out.println("-----------------");

        Admin admin = new Admin("王管理员", "wangadmin", "admin888");
        system.register(admin);
    }
}
