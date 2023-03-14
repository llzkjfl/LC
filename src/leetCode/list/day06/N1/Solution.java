package leetCode.list.day06.N1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/6 16:11
 */

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                arr[0] = map.get(nums[i]);
                arr[1] = i;
                return arr;
            }else {
                map.put(target-nums[i],i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,6,7,4};
        int[] res = twoSum(arr, 8);
        for (int a:res){
            System.out.println(a);
        }
    }
}
