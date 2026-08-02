import java.util.Scanner;

public class isHuiWen {
    public static void main(String[] args) {
        /*判断一个5位整数是否为回文数，例如：12321是回文数，12345不是回文数。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个5位整数：");
        int num = sc.nextInt();

        //数字拆分
        int ge=num%10;
        int shi=num/10%10;
        // int bai=num/100%10;
        int qian=num/1000%10;
        int wan=num/10000;

        //判断是否为回文数
        if(ge==wan && shi==qian){
            System.out.println("是回文数");
        }else{
            System.out.println("不是回文数");
        }
    }
}
