package leetCode.list.day07.N15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/7 10:21
 */

public class Solution {


    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int last = nums.length - 1;
        int j, k;
        if (nums[0] > 0 || nums[last] < 0) {
            return res;
        }
        if (last + 1 >= 3 && nums[0] == 0 && nums[last] == 0) {
            res.add(Arrays.asList(0, 0, 0));
            return res;
        }
        int target;
        for (int i = 0; i <= last - 2; i++) {
            j = i + 1;
            k = last;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (j < k) {
                target = nums[i] + nums[j] + nums[k];
                if (target < 0) {
                    j++;
                } else if (target > 0) {
                    k--;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                    j++;
                    k--;
                    while (nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }

        }
        return res;

    }


    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};       //-4 -1 -1 0 1 2
//        int nums[]= {0,0,0,0,0,0};
        List<List<Integer>> res = threeSum(nums);


        res.forEach(System.out::println);

    }


}
