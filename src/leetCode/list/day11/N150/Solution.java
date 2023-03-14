package leetCode.list.day11.N150;

import java.util.*;

/**
 * @Description: 逆波兰表达式
 * @Author: llz
 * @Date: 2023/3/11 1:45
 */

public class Solution {
    public static int evalRPN(String[] tokens) {
        Deque<Integer> dq = new LinkedList<>();  //双队列实现栈
        int a, b;
        for (String s : tokens) {               //遍历字符串
            if (dq.size() >= 2 && s.length() == 1 && s.charAt(0) < 48) {//栈中有两个以上元素
                a = dq.pollFirst();                     //并且当前字符串长度为一(防止负数) 且ascii码小于48(防正数)
                b = dq.pollFirst();
                switch (s.charAt(0)) {//遇见操作符 弹出栈顶两个元素 并操作后压入栈
                    case 42:                    //42为*
                        dq.offerFirst(a * b);
                        break;
                    case 43:                    //43为+
                        dq.offerFirst(a + b);
                        break;
                    case 45:                    //45为-
                        dq.offerFirst(b - a);
                        break;
                    case 47:                    //47为/
                        dq.offerFirst(b / a);
                        break;
                }
            } else {
                dq.offerFirst(Integer.parseInt(s)); //压出最后一个数，即为结果
            }
        }

        return dq.pollFirst();
    }



    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}
