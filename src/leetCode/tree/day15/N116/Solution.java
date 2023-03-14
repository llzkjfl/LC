package LeetCode.tree.day15.N116;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Description: 指向有兄弟节点
 * @Author: llz
 * @Date: 2023/3/14 19:03
 */

public class Solution {
    public Node connect(Node root) {
        if (root == null) return root;
        Deque<Node> dq = new LinkedList<>();
        dq.offerLast(root);
        Node cur;
        int len;
        while (!dq.isEmpty()) {
            len = dq.size();
            while (len > 0) {
                cur = dq.pollFirst();
                len--;
                if (len > 0) {
                    cur.next = dq.peekFirst();
                }

                if (cur.left != null) {
                    dq.offerLast(cur.left);
                }
                if (cur.right != null) {
                    dq.offerLast(cur.right);
                }
            }
        }
        return root;
    }
}

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

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
};
*/
