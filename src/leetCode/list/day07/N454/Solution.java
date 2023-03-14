package leetCode.list.day07.N454;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/6 22:42
 */

public class Solution {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : nums1) {
            for (int b : nums2) {
                if (map.containsKey(a + b)) {
                    map.put(a + b, map.get(a+b)+1);
                } else {
                    map.put(a + b, 1);
                }
            }
        }

        int cnt = 0;
        for (int c : nums3) {
            for (int d : nums4) {
                if (map.containsKey(0-(c + d))) {
                    cnt += map.get(0-(c + d));
                }

            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int num1[] = {-1,-1};
        int num2[] = {-1,1};
        int num3[] = {-1,1};
        int num4[] = {1,-1};

        System.out.println(fourSumCount(num1, num2, num3, num4));
    }
}