package LeetCode.tree.day15.N111;

import com.sun.xml.internal.txw2.output.DumbEscapeHandler;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/14 20:01
 */

public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        TreeNode cur;
        int cnt = 0, len;
        while (!que.isEmpty()) {
            len = que.size();

            while (len > 0) {
                cur = que.poll();

                if (cur.left != null) {
                    que.offer(cur.left);
                } else {
                    return cnt;
                }
                if (cur.right != null) {
                    que.offer(cur.right);
                } else {
                    return cnt;
                }
                len--;
            }
            cnt++;
        }
        return cnt;
    }
}
