package leetCode.list.day13.N347;

import java.util.*;

/**
 * @Description: 前k个高频词
 * @Author: llz
 * @Date: 2023/3/12 11:55
 */

public class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();            //key存元素，value存出现次数
        int len = nums.length;
        for (int i = 0; i < len; i++) {                         //将nums添加进map
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);// getOrDefault
        }
        PriorityQueue<int[]> pQ = new PriorityQueue<>((i1,i2)->i1[1]-i2[1]);
        //创建优先对列(小根堆实现),传入比较器-->头到尾 单调增

        //将map中value填入pQ 使用键值对entry遍历map
         Set<Map.Entry<Integer,Integer>> set= map.entrySet();
        for(Map.Entry<Integer,Integer> entry:set){//遍历set中map.entry键值对
            if(pQ.size()<k){                    //小于k个加入队尾自动维护 从根到头比较
                pQ.offer(new int[]{entry.getKey(),entry.getValue()});//
            }else {
                if(pQ.peek()[1]>entry.getValue()){
                    continue;
                }else {
                    pQ.poll();
                    pQ.offer(new int[]{entry.getKey(),entry.getValue()});
                }
            }
        }
        //添加完毕 现在pQ中有前k个[1]最大得数组 根据[1]从小到大排列
         //添加到数组 验证
        int res[] = new int[k];
        if(k==pQ.size()){
           for(int i = 0;i<res.length;i++){
               res[i] = pQ.poll()[0];
           }
        }


        return res;

    }






    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3,3,3,3};
        System.out.println(topKFrequent(arr,2));
    }
}