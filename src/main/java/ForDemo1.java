public class ForDemo1 {
    public static void main(String[] args) {
        /*有一组特殊的数字，从第三项开始，每一项都是前两项的数字和，请问第10项的数字是多少？
        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89.…*/
        int a=0;
        int b=1;
        int target=10;
        System.out.print(1+",");
        for(int i=0;i<target;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c);
            System.out.print(i==target-1?"\n":",");

        }
    }
}
