package LeetCode.tree.day15.N107;

import java.util.*;

/**
 * @Description: 二叉树的层次遍历
 * @Author: llz
 * @Date: 2023/3/14 13:18
 */

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> dq = new LinkedList<>();
        dq.offerLast(root);
        TreeNode cur;
        int len;

        while (!dq.isEmpty()) {
            len = dq.size();
            List<Integer> resLevel = new ArrayList<>();
            while (len > 0) {
                cur = dq.pollFirst();
                resLevel.add(cur.val);
                if (cur.left != null) dq.offerLast(cur.left);
                if (cur.right != null) dq.offerLast(cur.right);
                len--;
            }
            res.add(resLevel);

        }
        Collections.reverse(res);
        return res;

    }
}
