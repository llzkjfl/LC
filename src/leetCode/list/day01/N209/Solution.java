package leetCode.list.day01.N209;

/**
 * @Description: 209
 * @Author: llz
 * @Date: 2023/2/21 21:32
 */

public class Solution {
    public static void main(String[] args) {
        int[] a = new int[]{-4, -3, 0, 1, 5};
        int b[] = sortedSquares(a);
        for (int num:b) {
            System.out.println(num);
        }

    }


    public static int[] sortedSquares(int[] nums) {
        for(int i=0;i< nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        int temp;
        for(int i=0;i< nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;

    }
}