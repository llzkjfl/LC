package leetCode.list.day10.N225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description:但队列实现
 * @Author: llz
 * @Date: 2023/3/10 11:51
 */

public class MyStack_2 {
    Queue<Integer> queue = new LinkedList<>();

    public MyStack_2() {
    }

    public void push(int x) {                //所有入栈元素全部加入q1队尾
        queue.offer(x);
    }

    public int pop() {
        int cnt = 0;
        while (cnt != queue.size() - 1) {
            queue.offer(queue.poll());
            cnt++;
        }
        return queue.poll();

    }

    public int top() {                      //同pop
        int cnt = 0;
        while (cnt != queue.size() - 1) {
            queue.offer(queue.poll());
            cnt++;
        }
        int top = queue.peek();
        queue.offer(queue.poll());
        return top;
    }

    public boolean empty() {            //判空
        return queue.size() == 0;
    }
}
