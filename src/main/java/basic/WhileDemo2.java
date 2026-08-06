package basic;

public class WhileDemo2 {
    public static void main(String[] args) {
        /*需求：世界最高山峰珠穆朗玛峰高度是：8848.86米=8848860毫米，
        假如我有一张足够大的纸，它的厚度是0.1毫米。
        请问：该纸张折叠多少次，可以折成珠穆朗玛峰的高度?*/
        double paper=0.1;
        double height=8848860;
        int fold=0;
        while(paper<=height){
            paper+=paper;
            fold++;
        }
        System.out.println("需要折叠"+fold+"次，可以折成珠穆朗玛峰的高度");
    }
}
