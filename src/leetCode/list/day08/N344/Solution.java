package leetCode.list.day08.N344;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/8 9:03
 */

public class Solution {
    public static void reverseString(char[] s) {
        int left=0,right=s.length-1;
        char temp;
        while(left<right){
            temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }

    }

    public static void reverseString02(char[] s) {
        int n = s.length;
        char temp;
        for (int i = 0; i < n / 2; i++) {
            temp = s[n - 1 - i];
            s[n - 1 - i] = s[i];
            s[i] = temp;

        }

    }
    public static void main(String[] args) {
        String str = "nihhaoa";
        char c[] = str.toCharArray();
        reverseString02(str.toCharArray());



    }
}


/// public void reverseString(char[] s) {
//        int left=0,right=s.length-1;
//        char temp;
//        while(left<right){
//        temp = s[left];
//        s[left++] = s[right];
//        s[right--] = temp;
//        }
//        }