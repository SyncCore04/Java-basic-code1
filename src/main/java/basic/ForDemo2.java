package basic;

public class ForDemo2 {
    public static void main(String[] args) {
        /*100以内偶数和*/
        int sum = 0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
