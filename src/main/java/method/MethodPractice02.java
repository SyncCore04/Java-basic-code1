package method;

import java.util.Scanner;

public class MethodPractice02 {
    /*
    班主任需要统计10名学生的数学成绩（0-100分），
    计算及格率，平均分，并找出最高分。
    要求1：键盘录入10名学生的成绩，存入数组。超出范围，提示“成绩无效，请重新输入”。
    要求2：定义方法，求及格人数，根据及格人数，求及格率。
    要求3：定义方法求总分，根据总分求平均分
    要求4：定义方法求最大值。
     */
    public static void main(String[] args) {
        //1.录入10个学生的成绩
        Scanner input = new Scanner(System.in);
        int[] arr =new int[10];
        int i=0;
        while(i<10){
            System.out.print("请输入第"+(i + 1) + "个学生的成绩（0-100分）:");
            arr[i]=input.nextInt();
            if(arr[i]>100||arr[i]<0){
                System.out.println("成绩无效，请重新输入");
            }
            else{
                i++;
            }
        }
        //2.及格率
        int passCount=getPassCount(arr);
        double passRate=((double)passCount/arr.length)*100;
        System.out.println("及格率是:" + String.format("%.2f", passRate) + "%");
        //3.平均分
        double totalScore=getTotalScore(arr);
        double avgScore=(double)totalScore/arr.length;
        System.out.println("平均分是:" + String.format("%.2f", avgScore));
        //4.求最高分
        int maxScore=getMax(arr);
        System.out.println("最高分是:" + maxScore);
    }
    //2.定义方法求及格人数
    public static int getPassCount(int[] arr) {
        int count=0;
        for (int i : arr) {
            if(i>=60)
                count++;
        }
        return count;
    }
    //3.定义方法求总分
    public static double getTotalScore(int[] arr) {
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
    //4.定义方法求最大值
    public static int getMax(int[] arr) {
        int max=arr[0];
        for (int i : arr) {
            if(i>max)
                max=i;
        }
        return max;
    }

}
