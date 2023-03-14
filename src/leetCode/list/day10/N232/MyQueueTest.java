package leetCode.list.day10.N232;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/10 0:49
 */

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        System.out.println(obj.empty());

        obj.push(23);
        obj.push(24);
        obj.push(30);//30 24 23

        System.out.println(obj.empty());//fasle
        System.out.println(obj.peek());//23
        System.out.println(obj.pop());//23
        System.out.println(obj.peek());//24

    }
}
