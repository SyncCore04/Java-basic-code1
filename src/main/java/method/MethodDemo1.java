package method;

import java.util.Scanner;

public class MethodDemo1 {
    // 方法定义
    public static int getSum(int a ,int b){
        return a+b;
    }

    // 方法调用
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number");
        a = input.nextInt();
        System.out.println("enter b number");
        b = input.nextInt();

        System.out.println("a+b = "+getSum(a,b));
    }
}
