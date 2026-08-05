import java.util.Scanner;

public class ArrDemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) { //arr.fori  自动补全
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("下面为数组动态初始化5个数字");
        int[] arr2=new int [5];

        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("请输入第"+ (i+1) +"个整数:");
            arr2[i]=sc.nextInt();
        }

        System.out.println("arr2数组的数字分别为");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf(arr2[i]+" ");
        }


    }
}
