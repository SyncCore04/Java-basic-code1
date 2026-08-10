package algorithm;

public class FindMedian {
    /*
    FindMedian 寻找两个有序数组中位数
    需求：两个升序数组，先合并为有序数组，再求出中位数
    规则：
    1. 合并后总长度为奇数：取正中间单个元素
    2. 合并后总长度为偶数：中间两个数求平均值
    */
    public static void main(String[] args) {
        int[] num1 = {1, 3, 5};
        int[] num2 = {2, 4, 6};
        int[] num3 = new int[num1.length + num2.length];

        //双指针归并，有序合并两个升序数组
        int i = 0, j = 0, k = 0;
        while (i < num1.length && j < num2.length) {
            if (num1[i] < num2[j]) {
                num3[k++] = num1[i++];
            } else {
                num3[k++] = num2[j++];
            }
        }
        //把num1剩余元素移入新数组
        while (i < num1.length) {
            num3[k++] = num1[i++];
        }
        //把num2剩余元素移入新数组
        while (j < num2.length) {
            num3[k++] = num2[j++];
        }

        // 打印合并后的有序数组num3
        for (int val : num3) {
            System.out.print(val + " ");
        }
        System.out.println();

        //求中位数
        int len = num3.length;
        if (len % 2 == 0) {
            double median = (num3[len / 2 - 1] + num3[len / 2]) / 2.0;
            System.out.println("中位数为：" + median);
        } else {
            System.out.println("中位数为：" + num3[len / 2]);
        }
    }
}