package LeetCode.tree.day15.N116;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/14 19:04
 */

public class Node {
    int val;
    Node left;
    Node right;
    Node next;

    public Node() {}
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
