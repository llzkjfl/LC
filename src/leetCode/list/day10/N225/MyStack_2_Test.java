package leetCode.list.day10.N225;

/**
 * @Description: 测试
 * @Author: llz
 * @Date: 2023/3/10 11:55
 */

public class MyStack_2_Test {
    public static void main(String[] args) {
        MyStack_2 ms = new MyStack_2();
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
