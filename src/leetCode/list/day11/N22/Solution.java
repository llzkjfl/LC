package leetCode.list.day11.N22;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Description:括号匹配
 * @Author: llz
 * @Date: 2023/3/10 12:12
 */

public class Solution {
    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        if (len % 2 != 0) {         //长度为基数返回false
            return false;
        }
        if (chars[0] == ')' || chars[0] == '}' || chars[0] == ']') return false; //第一个元素为右括号返回false
        if (chars[len - 1] == '(' || chars[len - 1] == '[' || chars[len - 1] == '{') return false;//最后一个元素为左括号返回false
        Deque<Character> dq = new LinkedList<>();                   //双端队列模拟栈
        int flag;                                                   //容量值
        for (int i = 0; i < len; i++) {                             //遍历字符串数组
            flag = dq.size();                                       //当前长度赋值
            switch (chars[i]) {
                case '(':
                case '[':
                case '{':
                    dq.offerFirst(chars[i]);                        //如果是左括号，压入栈
                    break;
                case ')':
                    if (dq.size()!=0&&dq.peekFirst() == '(') dq.pollFirst();//如果是右括号，且栈顶是对应左括号，弹出
                    break;                                                  //不匹配则无操作 跳出reak
                case '}':
                    if (dq.size()!=0&&dq.peekFirst() == '{') dq.pollFirst();
                    break;
                case ']':
                    if (dq.size()!=0&&dq.peekFirst() == '[') dq.pollFirst();
                    break;
            }
            if (dq.size() == flag) {                                        //如果长度没有变化，返回false
                return false;
            }
        }
        return dq.size() == 0;                                              //返回栈是否为空
    }

    public static void main(String[] args) {
        System.out.println(isValid("([}}])"));
    }
}
