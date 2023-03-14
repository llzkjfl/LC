package leetCode.list.day10.N225;

/**
 * @Description: 测试栈
 * @Author: llz
 * @Date: 2023/3/10 10:54
 */

public class MyStackTest {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        System.out.println(ms.empty());//true
        ms.push(3);
        ms.push(2);
        ms.push(1);
        System.out.println(ms.empty());//false
        System.out.println(ms.pop());
        ms.pop();
        System.out.println(ms.top());   //3

    }
}
