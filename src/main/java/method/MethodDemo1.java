package method;

public class MethodDemo1 {
    // 方法定义
    public static int getSum(int a ,int b){
        return a+b;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(getSum(a,b));
    }
}
