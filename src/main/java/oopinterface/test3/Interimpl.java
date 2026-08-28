package oopinterface.test3;

public class Interimpl extends Person implements Inter1, Inter2 {
    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void function1() {
        System.out.println("function1");
    }

    @Override
    public void function2() {
        System.out.println("function2");
    }
}
