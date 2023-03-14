package leetCode.list.day13.N239;

import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * @Description: 滑动窗口方法
 * @Author: llz
 * @Date: 2023/3/11 21:12
 */

public class Solution {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();     //用双端队列模拟单调队列
        int len = nums.length;                      //数组长度
        int res[] = new int[len - k + 1];
        for (int i = 0; i < len; i++) {                     //遍历数组

            while (!dq.isEmpty() && nums[i] > nums[dq.peekLast()]) {//如果队列不为空且当前元素比队尾元素(对应的数组元素)大
                dq.pollLast();                       //弹出队尾元素
            }
            dq.offerLast(i);                         //将当前下标push队尾，此队中没有比当前元素小的元素

            if (i - dq.peekFirst() >= k) {           //如果当前下标与队头下标相差个数大于等于窗口大小
                dq.pollFirst();                      //此时对头下标元素已经和新窗口无关 弹出对头
            }
            if (i >= k - 1) {                        //如果i>=k-1，此时已经有窗口形成 且该队列对头为该窗口最大值
                res[i - k + 1] = nums[dq.peekFirst()]; //将队头元素下标的元素存储在结果数组中
            }                                        //i-k+1判断当前是第几个窗口的最大值
        }


        return res;

    }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int res[] = maxSlidingWindow(arr,3);


        for(int i:res){
            System.out.print(i+" ");
        }
    }
}