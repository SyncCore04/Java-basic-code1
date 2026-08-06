package basic;

public class ArrayPractice {
    public static void main(String[] args) {
        /*
        题目1：给定数组 nums，目标 target，找出相加等于 target 的两个数字的下标。
            要求 1：找到第一对就结束；要求 2：输出全部满足条件的组合。
            提示：初学先用双层循环，不考虑效率。
         */
        System.out.println("题目1：");
        int[] nums = {2,7,11,15,3,6};
        int target = 18;

        // 找第一对，找到直接break全部循环
        boolean found = false;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    System.out.println("下标："+i +" , "+j);
                    System.out.println("数值："+nums[i] +" , "+nums[j]);
                    found = true;
                    break; //跳出内层j循环
                }
            }
            if(found)
                break; //跳出外层循环

        }

    /*
    题目2：合并有序数组
        给你两个有序数组 nums1 和 nums2，将 nums2 合并到 nums3 中，使 nums3 成为有序数组。
    */
        System.out.println("题目2：");
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};

        //新数组长度 = 两个数组长度之和
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0; //arr1指针
        int j = 0; //arr2指针
        int k = 0; //arr3指针

        //两个数组都没遍历完的时候，循环比较
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }else{
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        //arr1还有剩余元素，直接搬过去
        while(i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        //arr2还有剩余元素，直接搬过去
        while(j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        for(int num:arr3){
            System.out.print(num+" ");
        }


    }
}
