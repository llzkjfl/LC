package LeetCode.tree.day15.N104;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/14 19:37
 */



public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int len;
        TreeNode cur;
        int cnt = 0;
        while (!que.isEmpty()) {
            len = que.size();
            while (len > 0) {
                cur = que.poll();
                if (cur.left != null) que.offer(cur.left);
                if (cur.right != null) que.offer(cur.right);
                len--;
            }
            cnt++;
        }
        return cnt;
    }
}
