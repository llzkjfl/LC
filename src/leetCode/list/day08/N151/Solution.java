package leetCode.list.day08.N151;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/8 16:46
 */

public class Solution {
    public static void main(String[] args) {

        String str = "  wo   ai ni";
        System.out.println(reverseWords(str));

    }

    public static String reverseWords(String s) {

        char[] chars = s.toCharArray();
        int n = chars.length;
        int p=0,q=n-1;
        while(chars[p]==' '){p++;}
        while(chars[q]==' '){q--;};

        StringBuilder sb = new StringBuilder();


        int cnt;
        for (int i = q+1; i > p; ) {
            cnt = 0;
            while (i > p && chars[i - 1] != ' ') {
                i--;
                cnt++;
            }
            if (cnt != 0) {
                sb.append(chars, i, cnt);
            }
            if (i == 0) {
                break;
            }
            while (i>p&&chars[i - 1] == ' ') {
                i--;
            }
            sb.append(' ');
        }
        return sb.toString();
    }
}



//
//    public static String reverseWords(String s) {
//        String s1 = s.trim();
//        StringBuilder sb = new StringBuilder();
//        char[] chars = s1.toCharArray();
//        int n = chars.length;
//        int cnt, p;
//        for (int i = n; i > 0; ) {
//            cnt = 0;
//            while (i > 0 && chars[i - 1] != ' ') {
//                i--;
//                cnt++;
//            }
//            if (cnt != 0) {
//                sb.append(chars, i, cnt);
//            }
//            if (i == 0) {
//                break;
//            }
//            while (chars[i - 1] == ' ') {
//                i--;
//            }
//            sb.append(' ');
//        }
//        return sb.toString();
//    }
//}
