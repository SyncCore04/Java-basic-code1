package method;

import java.util.Random;

public class MethodDemo2 {
    public static void main(String[] args) {
        //1.去除重复元素（力扣算法）
        //需求：获取10个0-100之间的随机数并存入到数组当中,要求保证数据是唯一的
        Random rand = new Random();
        int[] arr = new int[10];
        int i = 0;

        while ( i < arr.length ) {
            int num = rand.nextInt(100)+1;
            boolean flag=check(num,arr);

            if(flag) {
                arr[i] = num;
                i++;
            }
        }

        for ( i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }

    public static boolean check(int num,int[] arr){
        for (int i : arr) {
            if (i == num)
                return false;
            //如果遇到一个重复的，则不唯一，直接返回false，未找到
        }
        //如果没有遇到重复的，则保证唯一，返回true，找到
        return true;
    }
}