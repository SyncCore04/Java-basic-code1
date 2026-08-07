package method;

public class MethodDemo4 {
     /*
        方法重载   **一般不会写成顺序不同的方式**
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(getSum(a, b));// 实参 形参——对应的那个方法
    }
    //若将13-15注释掉，编译器会报错
    public static double getSum(int a, int b) {
        return a + b;
    }

    public static double getSum(int a, double b) {
        return a + b;
    }

    public static double getSum(double a, int b) {
        return a + b;
    }

    public static double getSum(double a, double b) {
        return a + b;
    }
}
