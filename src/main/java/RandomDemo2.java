import java.util.Random;
import java.util.Scanner;

public class RandomDemo2 {
    public static void main(String[] args) {
        /*
        生成一个1~100之间的随机数，利用键盘录入模拟猜的动作，一直猜，直到猜中为止
        抽卡的时候，有保底机制
        小保底：只要三次没有猜中，提示用户猜测的范围±5
        大保底：只要5次没有猜中，猜中了
        */
        Scanner sc = new Scanner(System.in);
        Random r=new Random();
        int number=r.nextInt(100)+1;
        System.out.println(number); //开发者视角
        int count=0;

        while(count<5){
            System.out.print("请输入您猜的数字:");
            int guess=sc.nextInt();
            count++;

            if(guess==number)
                break;
            else  if(guess>number)
                System.out.println("您猜的数字太大了");
            else
                System.out.println("您猜的数字太小了");

            if(count==3)
                System.out.println("小保底："+(number-5)+"~"+(number+5));
        }
        if(count==5)
            System.out.print("触发大保底机制>>");
        System.out.println("您猜对了，游戏结束");
    }
}

