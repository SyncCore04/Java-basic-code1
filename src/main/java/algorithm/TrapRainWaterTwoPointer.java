package algorithm;

public class TrapRainWaterTwoPointer {
    public static void main(String[] args) {
        /*
        42. 接雨水【双指针优化版】
        预处理数组解法需要额外O(n)空间，双指针将空间复杂度优化至O(1)
        输入：height=[0,1,0,2,1,0,1,3,2,1,2,1]
        输出：6
        */
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};

        int left = 0;
        int right = arr.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int sum = 0;

        while (left < right) {
            if (arr[left] < arr[right]) {
                // 左侧柱子更矮，水位由左侧边界决定
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    sum += leftMax - arr[left];
                }
                left++;
            } else {
                // 右侧柱子更矮，水位由右侧边界决定
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    sum += rightMax - arr[right];
                }
                right--;
            }
        }
        System.out.println(sum);
    }
}