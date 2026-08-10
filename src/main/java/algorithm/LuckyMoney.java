package algorithm;

import java.util.Random;
import java.util.Scanner;

public class LuckyMoney {
    public static void main(String[] args) {
        int money;
        int n;
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入金额(整数)：");
        money=(sc.nextInt())*100;  //把元转换为分方便计算
        System.out.println("请输入人数：");
        n=sc.nextInt();

        if(money<5) {
            System.out.println("金额不足");
        }
        else{
            Random rand=new Random();
            for(int i=1;i<=n-1;i++){ //前四个为随机金额，第五个为剩余金额
                int luckyMoney=rand.nextInt(money-(n-i))+1;
                money-=luckyMoney;
                System.out.println("第"+i+"个人获得"+String.format("%.2f", luckyMoney*0.01)+"元");
            }
            System.out.println("第"+n+"个人获得"+String.format("%.2f", money*0.01)+"元");
        }
    }
}