package oopadvanced.toolclasstest;

public class Test {
    /*
    需求：
    在实际开发中，经常会遇到一些数组使用的工具类。
    请按照如下要求编写一个数组的工具类完成以下需求：
    1.提供一个方法printArr，用于遍历数组。
    格式如下：[10，20，50，34，100]（只考虑整数数组）
    2.提供一个方法getAverage，用于返回平均分。（只考虑整数数组）
     */

    public static void main(String[] args) {
        int[] arr={10,20,50,34,100};
        //调用方法
        ArrayUtil.printArr(arr);
        //调用字符串版本
        System.out.println(ArrayUtil.printArrStr(arr));

        System.out.println("平均分为:"+ArrayUtil.getAverage(arr));
    }
}
