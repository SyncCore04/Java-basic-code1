package algorithm;

public class RemoveElement {
    /*
    题意：数组内原地移除所有值等于val(这里是2)的元素，不新建数组；返回新数组有效长度。
    逻辑：
    快指针：遍历全部数组
    慢指针：记录要存放数据的下标
    如果快指针元素 不等于要移除的值，就把值赋值给慢指针位置，慢指针往后走；等于就跳过。
    */
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,2,2,3,3,3,3};
        System.out.println("原始数组为");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if(i!=nums.length-1)
                System.out.print(", ");
            else
                System.out.println();
        }
        int val = 2;
        int len = removeElement(nums,val);//通过len来控制打印的数组长度
        System.out.println("移除了"+val+"后的数组为");
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
            if(i!=len-1)
                System.out.print(", ");
            else
                System.out.println();
        }

        //以下为额外补充代码:
        System.out.println("本质上数组长度依然是:"+nums.length+"完整数组为：");
        for (int num : nums) {
            System.out.print(num+", ");
        }
        System.out.println();
        //补充代码结束

    }
    public static int removeElement(int[] nums, int val){
        int len = nums.length;
        int slow=0;
        int fast=0;
        while(fast<len){
            if(nums[fast]!=val) {
                nums[slow++]=nums[fast];
                fast++;
            }
            else {
                fast++;
            }
        }
        return slow;
    }
}
