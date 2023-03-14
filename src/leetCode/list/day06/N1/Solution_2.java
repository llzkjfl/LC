package leetCode.list.day06.N1;

import java.util.Arrays;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/7 15:52
 */

public class Solution_2 {
    public static int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int left = 0;
        int right = nums.length - 1;
        Arrays.sort(nums);
        for (int a:nums
             ) {
            System.out.println(a);
        }
        while (true) {
            if (nums[left] + nums[right] > target) {
                right--;
                continue;
            } else if (nums[left] + nums[right] < target) {
                left++;
                continue;
            }
            break;
        }
        arr[0] = left;
        arr[1] = right;
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 6, 7, 4};
        int[] res = twoSum(arr, 8);
        System.out.println("==============");
        for (int a : res) {
            System.out.println(a);
        }
    }
}