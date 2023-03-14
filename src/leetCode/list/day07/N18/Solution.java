package leetCode.list.day07.N18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/7 20:25
 */

public class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (n < 4) {
            return res;
        }
        Arrays.sort(nums);
        int i, j, k, l;
        int sum1_2, sum1_4;  //-2 -1 -1 0 1 4 5 6     //2

        for (i = 0; i < n - 3; i++) {
            //剪枝
            if(target>0&&nums[i]>target) return res;

            //去重
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (j = i+1;j < n - 2; j++) {
                sum1_2 = nums[i] + nums[j];
                //剪枝

                //去重
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                k = j + 1;
                l = n - 1;
                //-10 -9 -8 -8 -8 -7 -2(6) 0 0 1 3 5 6 7 7 8 8

                while (k < l) {
                    sum1_4 = sum1_2 + nums[k] + nums[l];
                    if (sum1_4 < target) {
                        k++;
                    } else if (sum1_4 > target) {
                        l--;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    }
                }

            }

        }

        return res;
    }

    public static void main(String[] args) {
        int nums[] = {-9,-2,7,6,-8,5,8,3,-10,-7,8,-8,0,0,1,-8,7};       //-4 -1 -1 0 1 2
//        int nums[]= {0,0,0,0,0,0};
        List<List<Integer>> res = fourSum(nums,4);
        Arrays.sort(nums);

        res.forEach(System.out::println);
    }
}
