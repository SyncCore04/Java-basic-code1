import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        /*需求：随机生成10个1-100之间的整数*/
        Random r=new Random();
        for(int i=0;i<10;i++){
            int n=r.nextInt(1,100);
            System.out.println(n);
        }
    }
}
