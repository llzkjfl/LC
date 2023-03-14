package leetCode.tree.day14.itera.N145;

import java.util.*;

/**
 * @Description: 后续遍历_迭代
 * @Author: llz
 * @Date: 2023/3/13 0:31
 */

public class Solution {
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> dq = new LinkedList<>();
        TreeNode cur = root;
        dq.offerLast(root);

        while (!dq.isEmpty()) {    //入栈顺序为中左右加入集合为中右左 逆序
            cur = dq.pollLast();      //调整前序迭代顺序即可得到后续迭代
            res.add(cur.val);
            if (cur.left != null) {
                dq.offerLast(cur.left);
            }
            if (cur.right != null) {
                dq.offerLast(cur.right);
            }
        }
        Collections.reverse(res);     //逆序将中右左变为中左右
        return res;
    }


    public static void main(String[] args) {
       TreeNode treeNode3 = new TreeNode(3,null,null);
       TreeNode treeNode2 = new TreeNode(2,treeNode3,null);
       TreeNode treeNode1 = new TreeNode(6,null,treeNode2);
       TreeNode root = treeNode1;

        List<Integer> res = postorderTraversal(root);
        res.forEach(System.out::println);
    }
}
