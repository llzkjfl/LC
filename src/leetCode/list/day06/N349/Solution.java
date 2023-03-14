package leetCode.list.day06.N349;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/6 11:03
 */

public class Solution {

    public static void main(String[] args) {

        int arr1[] = new int[]{1,2,3,4,5,6};
        int arr2[] = new int[]{4,5,6,4,7};
        System.out.println(intersection(arr1,arr2).length);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        for(int i=0;i< nums1.length;i++){
            set.add(nums1[i]);
        }
        Set<Integer> set1 = new HashSet<>();
        for(int i=0;i< nums2.length;i++){
            if(set.contains(nums2[i])){
                set1.add(nums2[i]);
            }
        }

        int []array = new int[set1.size()];
        Object[] objects = set1.toArray();
        for(int i=0;i<set1.size();i++){
            array[i] = (int)objects[i];
        }
        return array;
    }
}
