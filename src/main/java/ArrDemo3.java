import java.util.Random;

public class ArrDemo3 {
    public static void main(String[] args) {
        //1.去除重复元素（力扣算法）
            //需求：获取10个0-100之间的随机数并存入到数组当中,要求保证数据是唯一的
        Random rand = new Random();
        int[] arr = new int[10];
        int i = 0;

        while ( i < arr.length ) {
            int num = rand.nextInt(100);
            boolean flag=true;
            for (int j = 0; j < i; j++) {
                //j<arr.length 不安全，因为i可能未被赋值，导致数组越界
                if(arr[j]==num) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                arr[i] = num;
                i++;
            }
        }

        for ( i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    // 2.快慢指针
        int[] arr2={1,1,2,2,2,2,3,3,3,3};
        int slow=0;
        int fast=1;

        while (fast<arr2.length) {
            if(arr2[slow]!=arr2[fast]) {
                slow++;
                arr2[slow]=arr2[fast];
            }
            fast++;
        }

        System.out.println();

        for (i = 0; i <= slow; i++) {
            System.out.print(arr2[i]+" ");
        }

    }

}
