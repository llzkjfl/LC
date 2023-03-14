package leetCode.list.day09.N28;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/9 9:07
 */

public class Solution {
    public static int strStr(String haystack, String needle) {
        int l1 = haystack.length(), l2 = needle.length();
        if (l1 < l2) return -1;
        if (l1 == l2 && !haystack.equals(needle)) return -1;

        char[] lc1 = haystack.toCharArray();
        char[] lc2 = needle.toCharArray();

        int p = 0, q = 0, start;
        while (p < l1) {
            start = p;
            q = 0;
            if (p + l2 > l1) return -1;
            while (q < l2) {
                if (lc1[p] == lc2[q]) {
                    p++;
                    q++;
                } else {
                    break;
                }
                if (q == l2) {
                    return p - q;
                }
            }
            p = start + 1;
        }

        return 0;
    }


    public static void main(String[] args) {
        System.out.println(strStr("llzsdasd","da"));

        "sdadas".contains("dsads");
    }
}
