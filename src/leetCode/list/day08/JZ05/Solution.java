package leetCode.list.day08.JZ05;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/8 13:46
 */

public class Solution {
    public static String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int j;
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] == ' ') {
                sb.append(chars, i - cnt, cnt); //5 4 6 ' '
                sb.append("%20");
                cnt = 0;
                continue;
            } else if (i == n - 1) {
                sb.append(chars, i - cnt, cnt + 1);
                break;
            }
            cnt++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
            String str = "We are happy";
        System.out.println(replaceSpace(str));
    }
}
