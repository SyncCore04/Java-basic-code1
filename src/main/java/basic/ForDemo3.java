package basic;

import java.util.Scanner;

public class ForDemo3 {
    public static void main(String[] args) {
        /*S(4)=1-2+3-4=-2*/
        int Sn=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%2==0){
                Sn-=i;
            }else{
                Sn+=i;
            }
        }
        System.out.println("数列的和为："+Sn);
    }
}
