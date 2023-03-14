package LeetCode.tree.day15.N117;



import java.util.Deque;
import java.util.LinkedList;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/14 19:50
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
