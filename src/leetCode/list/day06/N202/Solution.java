package leetCode.list.day06.N202;

import java.util.HashSet;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/6 11:42
 */

public class Solution {

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1&&!set.contains(n)){
            set.add(n);
             n = getNextNumber(n);
        }
        return n==1;
    }

    private static int getNextNumber(int n){

        int res = 0;
        while(n>0){
            int pow = n%10;
            res += pow*pow;
            n/=10;
        }
        res += n*n;

        return res;
    }


    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }


}
