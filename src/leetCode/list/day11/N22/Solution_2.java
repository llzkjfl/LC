package leetCode.list.day11.N22;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Description: 括号匹配2
 * @Author: llz
 * @Date: 2023/3/10 19:38
 */

public class Solution_2 {

    public static boolean isValid(String s) {
        Deque<Character> dq = new LinkedList<>();
        for (char c : s.toCharArray()) {  //遍历字符串数组
            if (c == '(') {                 //遍历左括号，入栈相应的右括号
                dq.offerFirst(')');
            } else if (c == '{') {
                dq.offerFirst('}');
            } else if (c == '[') {
                dq.offerFirst(']'); //遍历到不是左括号时如果出栈括号和遍历不匹配返回失败
            } else if (dq.isEmpty() || !(dq.pollFirst() == c)) {

                return false;
            }
        }
        return dq.isEmpty();
    }

    public static void main(String[] args) {
        int i = 0;
        System.out.println(isValid("(){()[]}"));
    }


}
