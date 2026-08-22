package oopadvanced.extendstest.test8;

public class Test {
    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.name="aaa";

        zi.show();
    }
}

class Fu{
    String name;
}

class Zi extends Fu{
    String name;

    public void show(){
        System.out.println(name+" "+super.name);
    }
}
