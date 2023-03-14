package leetCode.list.day11.N1047;


/**
 * @Description:删除所有相同元素
 * @Author: llz
 * @Date: 2023/3/10 22:25
 */

public class Solution {
    public static String removeDuplicates(String s) {
        char[] chars = s.toCharArray();
        char[] chars1 = new char[chars.length];      //新建一个同样大小的数组作为栈
        int hh = 0, tt = -1;                        //tt为栈顶指针初始值为-1 hh为标志为0
        for (char c : chars) {                      //遍历字符串数组
            if (tt < hh || c != chars1[tt]) {       //如果空栈或是原数组当前元素与栈顶不相等
                chars1[++tt] = c;                   //入栈--->tt先加一
            } else {                                //否则即遇到相等的弹出栈
                tt--;                               //在数组中实现为索引减一
            }
        }
        return new String(chars1,0,tt+1);//返回tt+1个字符构成的字符串
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaaaca"));
    }
}