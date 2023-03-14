package LeetCode.tree.day15.N637;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: llz
 * @Date: 2023/3/14 16:02
 * @Description:
 * 给定一个非空二叉树的根节点 root ,
 * 以数组的形式返回每一层节点的平均值。
 * 与实际答案相差 10-5 以内的答案可以被接受。
 */

public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> resAve = new ArrayList<>();
        if (root == null) return resAve;
        Deque<TreeNode> dq = new LinkedList<>();
        dq.offerLast(root);
        int len, cnt;
        double sum;
        TreeNode cur;
        while (!dq.isEmpty()) {
            sum = 0;
            len = dq.size();
            cnt = len;
            while (len > 0) {
                cur = dq.pollFirst();
                sum += cur.val;
                if (cur.left != null) {
                    dq.offerLast(cur.left);
                }
                if (cur.right != null) {
                    dq.offerLast(cur.right);
                }
                len--;
            }
            resAve.add(sum / cnt);
        }
        return resAve;
    }
}
