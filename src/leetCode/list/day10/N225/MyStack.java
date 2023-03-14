package leetCode.list.day10.N225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description: 队列实现栈
 * @Author: llz
 * @Date: 2023/3/10 10:42
 */

class MyStack {

    Queue<Integer> q1 = new LinkedList<>();  //操作队列
    Queue<Integer> q2 = new LinkedList<>();  //备份队列

    public MyStack() {
    }

    public void push(int x) {                //所有入栈元素全部加入q1队尾
        q1.offer(x);
    }

    public int pop() {
        while (q1.size() != 1) {            //将n-1个q1对首元素依次出队加入到q2
            q2.offer(q1.poll());            //最后一个即为栈顶元素
        }
        int popem = q1.poll();              //出栈
        while (q2.size() != 0) {            //将备份q2的元素重新返回q1
            q1.offer(q2.remove());
        }
        return popem;
    }

    public int top() {                      //同pop
        while (q1.size() != 1) {
            q2.offer(q1.poll());
        }
        int topem = q1.peek();              //取除不删除
        q2.offer(q1.poll());                //栈顶入队
        while (q2.size() != 0) {
            q1.offer(q2.remove());
        }
        return topem;
    }

    public boolean empty() {            //判空
        return q1.size() + q2.size() == 0;
    }
}



/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
