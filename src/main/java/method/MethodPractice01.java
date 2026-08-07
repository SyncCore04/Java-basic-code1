package method;

import java.util.Scanner;

public class MethodPractice01 {
    public static void main(String[] args) {
        /*
        跳水比赛有五个评委打分，分数在0~100之间。最终得分会去掉一个最高分，去掉一个最低分，
        剩余的分数再求平均数，改平均数为选手最终得分。
        要求1：利用键盘录入5个整数存入数组当中，如果分数超出范围需要重新录入
        要求2：定义方法分别求数组的最大值和最小值
        要求3：计算五名评委的总分
        要求4：总分－最大值-最小值，求选手最终平均分
        */
        //1.录入5个评委的分数
        Scanner input = new Scanner(System.in);
        int[] arr =new int[5];
        int i=0;
        while ( i < 5 ) {
            System.out.print("请输入评委第"+(i + 1) + "个分数（整数）:");
            arr[i]=input.nextInt();
            if(arr[i]>=0&&arr[i]<=100)
                i++;
        }
        int max=getMax(arr);
        int min=getMin(arr);
        //3.计算总分
        int sum=0;
        for (int i1 : arr) {
            sum+=i1;
        }
        //4.计算最终平均分
        double avg=(double)(sum-max-min)/(arr.length-2);
        System.out.println("选手的平均分是:" + String.format("%.2f", avg));
        //System.out.printf("选手的平均分是:%.2f%n",avg);
    }
    //2.定义方法求最大最小值
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    public static int getMin(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
}
