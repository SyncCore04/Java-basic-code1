package algorithm;

public class TrapRainWater {
    public static void main(String[] args) {
        /*
        42. 接雨水
        给定n个非负整数，每个宽度为1的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
        示例：
        输入：height=[0,1,0,2,1,0,1,3,2,1,2,1]
        输出：6
        解释：
        上面的柱子高度图由数组图表示。
        在这种情况下，接6个单位的雨水（蓝色部分）。
        */
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        int[] leftMax=new int[arr.length];

        //1.预处理从左到右遍历的情况
        leftMax[0]=arr[0];
        int temp=0;
        for(int i=1;i<arr.length;i++){
            if(temp>arr[i]){
                leftMax[i]=temp;
            }
            else{
                leftMax[i]=arr[i];
                temp=arr[i];
            }
        }


        //2.预处理从右到左遍历的情况
        int[] rightMax=new int[arr.length];
        int lastIdx = arr.length - 1;
        rightMax[lastIdx] = arr[lastIdx];
        temp = arr[lastIdx];

        for(int i = lastIdx - 1; i >= 0; i--){
            if(temp > arr[i]){
                rightMax[i] = temp;
            }else{
                rightMax[i] = arr[i];
                temp = arr[i];
            }
        }


        //3.取交集
        int[] result=new int[arr.length];

        for (int i = 0; i < rightMax.length; i++) {
            if(leftMax[i]<rightMax[i]){
                result[i]=leftMax[i];
            }
            else{
                result[i]=rightMax[i];
            }
        }

        //4.计算接雨水的单位数,
        int sum=0;
        for (int i = 0; i < result.length; i++) {
            sum+=result[i]-arr[i];
        }
        System.out.println(sum);

    }
}
