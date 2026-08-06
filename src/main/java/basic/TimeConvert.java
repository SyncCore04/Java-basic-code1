package basic;

public class TimeConvert {
    public static void main(String[] args) {
        /*时间转换为时分秒格式，例如：3661秒转换为1小时1分1秒。*/
        int seconds = 3661;

        int hours = seconds /3600;
        int minutes = seconds % 3600 / 60;
        int second = seconds % 60;

        System.out.println(hours + "时" + minutes + "分" + second + "秒");
    }
}
