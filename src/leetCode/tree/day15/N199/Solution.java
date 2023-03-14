package LeetCode.tree.day15.N199;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:给定一个二叉树的 根节点 root，
 *              想象自己站在它的右侧，按照从顶部到底部的顺序，
 *              返回从右侧所能看到的节点值。
 * @Author: llz
 * @Date: 2023/3/14 14:52
 */

public class Solution { //思路每一层的最后一个
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> resRight = new ArrayList<>();
        if (root == null) {
            return new ArrayList<>();
        }

        Deque<TreeNode> dq = new LinkedList<>();
        dq.offerLast(root);
        int len;
        TreeNode cur = root;

        while (!dq.isEmpty()) {
            len = dq.size();
            while (len > 0) {
                cur = dq.pollFirst();
                if (cur.left != null) {
                    dq.offerLast(cur.left);
                }
                if (cur.right != null) {
                    dq.offerLast(cur.right);
                }
                len--;
            }
            resRight.add(cur.val);
        }
        return resRight;
    }
}
