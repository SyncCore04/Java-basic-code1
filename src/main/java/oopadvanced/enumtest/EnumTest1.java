package oopadvanced.enumtest;

public class EnumTest1 {
    public static void main(String[] args) {
        /*
        电商项目中，订单的状态只有以下 6 种，请编写代码实现。
        待支付  PAYMENT_PENDING
        处理中  PROCESSING
        已发货  SHIPPED
        配送中  OUT_FOR_DELIVERY
        已送达  DELIVERED
        已取消  CANCELLED
         */
        OderState o1 = OderState.PAYMENT_PENDING;

        switch (o1){
            case PAYMENT_PENDING -> System.out.println("待支付状态");
            case PROCESSING -> System.out.println("处理中状态");
            case SHIPPED -> System.out.println("已发货状态");
            case OUT_FOR_DELIVERY -> System.out.println("配送中状态");
            case DELIVERED -> System.out.println("已送达状态");
            case CANCELLED -> System.out.println("已取消状态");
            default -> System.out.println("未知状态");
        }
    }
}
