package leetCode.list.day10.N232;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Description:用栈实现队列
 * @Author: llz
 * @Date: 2023/3/10 0:28
 */

class MyQueue {
    Deque<Integer> inOue = new LinkedList<>();
    Deque<Integer> outQue = new LinkedList<>();

    public MyQueue() {

    }

    public void push(int x) {
        inOue.push(x);
    }

    public int pop() {
        if (inOue.size() + outQue.size() == 0) {
            return -1;
        }
        if (outQue.size() == 0) {
            while (inOue.size() != 0) {
                outQue.push(inOue.pop());
            }
            return outQue.pop();
        } else {
            return outQue.pop();
        }

    }

    public int peek() {
        if (inOue.size() + outQue.size() == 0) {
            return -1;
        }
        if (outQue.size() == 0) {
            while (inOue.size() != 0) {
                outQue.push(inOue.pop());
            }
            return outQue.peek();
        } else {
            return outQue.peek();
        }

    }

    public boolean empty() {
        return outQue.size() + inOue.size() == 0;
    }

}


