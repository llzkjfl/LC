package leetCode.list.day01.N59;

import org.junit.Test;

/**
 * @Description: 测试
 * @Author: llz
 * @Date: 2023/3/2 15:40
 */

public class Solution {

    public int[][] generateMatrix(int n) {
        int arr[][] = new int[n][n];
        int start = 0;          //起点
        int i, j;
        int count = 1;      //填充数据
        int loop = 0;          //当前循环层数 一层上下左右，主要用于确立右边
        while(loop++<n/2){        //loop从1开始，左闭右开
            for(j=start;j<n-loop;j++){
                arr[start][j] = count++;
            }
            for(i=start;i<n-loop;i++){
                arr[i][j] = count++;
            }

            for(;j>=loop;j--){
                arr[i][j] = count++;
            }
            for(;i>=loop;i--){
                arr[i][j] = count++;
            }
            start++;
        }
        if(n%2==1){
            arr[start][start] = count;
        }

//        while (loop++ < n / 2) { // 判断边界后，loop从1开始
//            // 模拟上侧从左到右
//            for (j = start; j < n - loop; j++) {
//                res[start][j] = count++;
//            }
//
//            // 模拟右侧从上到下
//            for (i = start; i < n - loop; i++) {
//                res[i][j] = count++;
//            }
//
//            // 模拟下侧从右到左
//            for (; j >= loop; j--) {
//                res[i][j] = count++;
//            }
//
//            // 模拟左侧从下到上
//            for (; i >= loop; i--) {
//                res[i][j] = count++;
//            }
//            start++;
//        }
//
//        if (n % 2 == 1) {
//            res[start][start] = count;
//        }
        return arr;
    }

    @Test
    public void testN59(){
        int arr[][] = generateMatrix(3);
      for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr[i].length;j++){
              System.out.print(arr[i][j]+" ");
          }
          System.out.println();
      }

    }

}
