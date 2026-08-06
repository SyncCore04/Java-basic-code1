package basic;

public class WhileDemo1 {
    public static void main(String[] args) {
        /*100000元存银行，复利1.7%,需要多少年可以实现本金翻倍*/
        double money=100000;
        double year=0;
        while(money<=200000){
            money=money*1.017;
            year++;
        }
        System.out.println("需要"+year+"年可以实现本金翻倍");
    }
}
