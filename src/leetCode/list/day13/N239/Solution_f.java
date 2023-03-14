package leetCode.list.day13.N239;

/**
 * @Description: 滑动窗口最大值----单调队列
 * @Author: llz
 * @Date: 2023/3/11 15:20
 */


public class Solution_f {

public static int[] maxSlidingWindow(int[] nums, int k) {
    if (nums == null) return nums;         //null返回数组
    int cnt = nums.length - k + 1;         //窗口左边最大到nums.length-k
    int res[] = new int[cnt];

    int max;
    for (int i = 0; i < cnt; i++) {
        max = nums[i];
        for (int j = i + 1; j < i + k; j++) {   //每k个一组
            if (nums[j] > max) {               //找出最大的
                max = nums[j];
            }
        }
       res[i] = max;                  // 将最大的压栈
    }

    return res;
}
    public static void main(String[] args) {
            int first[] = {1,3,-1,-3,5,3,6,7};//3,3,5,5,6,7
            int arr[] = maxSlidingWindow(first,3);
            for(int i=0;i< arr.length;i++){
                System.out.print(arr[i]+" ");
            }
    }
}
