package oopadvanced.extenddemo.demo2;

public class Test {
    public static void main(String[] args) {
        Employee e = new Employee("1001", "张三");
        System.out.println(e.getId()+" "+e.getName());
        e.work();

        System.out.println("-----------------");

        e.setId("1002");
        e.setName("李四");
        System.out.println(e.getId()+" "+e.getName());
        e.work();

        System.out.println("-----------------");

        e = new AdminStaff();
        e.setId("1003");
        e.setName("王五");
        System.out.println(e.getId()+" "+e.getName());
        e.work();

        System.out.println("-----------------");

        e = new Maintainer();
        e.setId("1004");
        e.setName("赵六");
        System.out.println(e.getId()+" "+e.getName());
        e.work();

        System.out.println("-----------------");

        e = new Buyer();
        e.setId("1005");
        e.setName("王二");
        System.out.println(e.getId()+e.getName());
        e.work();

        System.out.println("-----------------");

        e = new Lecturer();
        e.setId("1006");
        e.setName("讲师小明");
        System.out.println(e.getId() + " " + e.getName());
        e.work();

        System.out.println("-----------------");

        e = new Tutor();
        e.setId("1007");
        e.setName("助教小红");
        System.out.println(e.getId() + " " + e.getName());
        e.work();

    }
}
