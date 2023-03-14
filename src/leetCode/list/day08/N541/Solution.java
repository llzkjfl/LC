package leetCode.list.day08.N541;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/8 10:25
 */

public class Solution {
    public static String reverseStr(String s, int k) {
        //a b c d e f g h i j k
        //p   q p   q
        //0   2 3   5

        char[] chars = s.toCharArray();
        int n = chars.length;
        int p, q, pr;
        int num=k*2;
        int cir = n / num + 1;
        //
        char tmp;
        for (int i = 0; i < cir; i++) {
            p = i * num;
            q = p + k - 1;
            pr = p;
            if (p == n) {
                break;
            }
            if (q >= n) {
                q = n - 1;
            }
            while (p < q) {
                tmp = chars[p];
                chars[p++] = chars[q];
                chars[q--] = tmp;
            }
        }


        return String.valueOf(chars);
    }


    public static void main(String[] args) {
        String s = "1234567891231";
        System.out.println(reverseStr(s,3));
    }
}
