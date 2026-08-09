package method;

public class Memory {
    /*
    * 很显然这个方法不能交换a和b的值，因为a和b是形参，形参的值是不能改变的
    * 所以，需要使用引用传递，将a和b的地址传递给方法，方法中修改的是地址指向的内存中的值
    * 在JAVA中不能像C语言一样，通过“取地址”来进行引用传递，在JAVA中可通过数组、对象等来实现引用传递
    */
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int[] arr={1,2};
        System.out.println("交换前a=" + a + " b=" + b);
        change(a,b);
        System.out.println("交换后a=" + a + " b=" + b + "（值传递，原变量不变）");
        System.out.println("\n交换前arr[0]=" + arr[0] + " arr[1]=" + arr[1]);
        change2(arr, 0, 1);
        System.out.println("交换后arr[0]=" + arr[0] + " arr[1]=" + arr[1] + "（引用传递，数组内容已改变）");
    }

    public static void change(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }

    /*
     * 通过数组（引用传递）交换指定索引位置的元素
     * @param arr 数组
     * @param indexA 第一个元素的索引
     * @param indexB 第二个元素的索引
     */
    public static void change2(int[] arr, int indexA, int indexB){
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }
}