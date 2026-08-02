import java.util.Scanner;

public class ifDemo {
    public static void main(String[] args) {
        /*需求：初始最大生命200，受到X点伤害，技能恢复Y点血，X和Y由键盘录入而来
        假设，游戏人物不会死亡，最少1点血
        问：最终游戏人物血量是多少？*/
        int hp = 200;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入伤害值X");
        int X =sc.nextInt();
        hp -= X;
        if(hp<1)
        {
            hp=1;
            System.out.println("触发锁血被动\n");
        }

        System.out.println("当前人物血量为：" + hp);

        System.out.println("请输入恢复值Y");
        int Y =sc.nextInt();
        hp += Y;
        if(hp>200)
        {
            hp=200;
        }
        System.out.println("最终人物血量为：" + hp);
    }
}
