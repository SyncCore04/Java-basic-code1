package method;

public class MethodDemo3 {
    public static void main(String[] args) {
        /*
        方法遍历数组
        示例: [1,2,3,4,5]
        */
        int[] arr = {1,2,3,4,5};
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if(i==0)
                System.out.print("["+arr[i]+",");
            else if (i==arr.length-1)
                System.out.print(arr[i]+"]");
            else
                System.out.print(arr[i]+",");
        }
    }
}
