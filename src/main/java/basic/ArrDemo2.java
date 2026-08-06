package basic;

import java.util.Random;
import java.util.Scanner;

public class ArrDemo2 {
    public static void main(String[] args) {
        /*1. 查找数组，若找到，输出索引*/
        Scanner sc=new Scanner(System.in);
        int[] arr={33,42,13,44,57};
        boolean flag=false;
        System.out.println("请输入一个整数");
        int number=sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                flag=true;
                System.out.println("找到"+number+"，索引为"+i);
                break;
            }
//            else if(i==arr.length-1)
//                System.out.println("未找到 "+number);
        }
        if(!flag)
            System.out.println("未找到 "+number);


        /*2. 数组中的最值问题*/
        int max,min;
        max=min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println("数组中的最大值为："+max+"，最小值为："+min);


        /*3. 打乱数组中的数据*/
        Random rand=new Random();
        for (int i = 0; i < arr.length; i++) {
            int RandomIndex = rand.nextInt(arr.length);

            int temp=arr[i];
            arr[i]=arr[RandomIndex];
            arr[RandomIndex]=temp;
        }
        System.out.println("打乱后的数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
