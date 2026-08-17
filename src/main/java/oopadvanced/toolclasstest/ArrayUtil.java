package oopadvanced.toolclasstest;

public class ArrayUtil {
    //构造方法
    public ArrayUtil() {
    }

    //定义方法（静态）
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.println("]");

    }//工具类，用于格式化打印数组元素

    //字符串版本的printArr方法
    public static String printArrStr(int[] arr) {
        String str="[";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                str+=arr[i];
            }else{
                str+=arr[i]+",";
            }
        }
        str+="]";
        return str;
    }//工具类（字符串版本），用于格式化打印数组元素

    //平均分方法
    public static double getAverage(int[] arr) {
        double sum=0;
        for (int i : arr) {
            sum+=i;
        }

        return sum/arr.length;
    }
}