package leetCode.list.day13.N347;

import java.util.PriorityQueue;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/12 14:01
 */

public class PQ_test {
    public static void main(String[] args) {
        PriorityQueue<Integer> integers = new PriorityQueue<>((i1, i2)->i1-i2);
        integers.offer(3);
        integers.offer(2);
        integers.offer(6);
        integers.offer(1);
        integers.offer(9);
    }
}
