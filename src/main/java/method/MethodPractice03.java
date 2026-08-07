package method;

import java.util.Scanner;

public class MethodPractice03 {
    /*
    某快递公司的运费规则如下（首重1kg，超出部分按kg计算，不足1kg按1kg算）：
    首重1kg：10元；
    超出1-5kg:每kg加2元;
    超出5kg以上：每kg加1.5元。
    键盘录入小数，表示用户快递的重量，计算最终的结果
    要求1:快递重量必须大于0，否则重新输入
    要求2：不同价位的计算，单独定义一个方法
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight;

        // 1. 循环录入重量，直到大于0
        while (true) {
            System.out.print("请输入快递重量（kg）:");
            weight = input.nextDouble();
            if (weight > 0) {
                break;
            } else {
                System.out.println("重量必须大于0，请重新输入！");
            }
        }

        // 2. 调用方法计算运费并输出
        double fee = calculateFee(weight);
        System.out.printf("快递重量 %.2f kg，运费 %.2f 元%n", weight, fee);
    }
    /*
     * 根据重量计算快递运费
     * @param weight 快递重量（kg），必须大于0
     * @return 运费（元）
     */
    public static double calculateFee(double weight) {
        final double FIRST_KG_PRICE = 10.0;   // 首重1kg价格
        final double EXTRA_1_TO_5_PRICE = 2.0; // 超出1~5kg每kg单价
        final double EXTRA_ABOVE_5_PRICE = 1.5; // 超出5kg以上每kg单价

        if (weight <= 1) {
            // 重量≤1kg，只收首重费用
            return FIRST_KG_PRICE;
        }

        // 超出部分（kg），并向上取整为整kg
        double extra = weight - 1;
        int extraKg = (int) Math.ceil(extra);

        double extraFee;
        if (extraKg <= 5) {
            // 超出部分在1~5kg之间
            extraFee = extraKg * EXTRA_1_TO_5_PRICE;
        } else {
            // 超出部分超过5kg：前5kg按2元，剩余按1.5元
            extraFee = 5 * EXTRA_1_TO_5_PRICE + (extraKg - 5) * EXTRA_ABOVE_5_PRICE;
        }

        return FIRST_KG_PRICE + extraFee;
    }

}
