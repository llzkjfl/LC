package leetCode.tree.day14.itera.N144;

import java.util.*;

/**
 * @Description: 先序遍历___迭代法
 * @Author: llz
 * @Date: 2023/3/12 9:43
 */

public class Solution {

    public static List<Integer> preorderTraversal(TreeNode root) {
        Deque<TreeNode> dq = new LinkedList<>();            //双端队列模拟栈
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        dq.offerLast(root);                                 //将根压入栈
        TreeNode node;
        while (!dq.isEmpty()) {
            node = dq.pollFirst();                          //根出栈
            res.add(node.val);
            if (node.right != null) {                          //加入右孩子
                dq.offerLast(node.right);
            }
            if (node.left != null) {                           //加入左孩子
                dq.offerLast(node.left);
            }
        }
        return res;
    }



    public static void main(String[] args) {
        TreeNode treeNode3 = new TreeNode(3,null,null); //左
        TreeNode treeNode2 = new TreeNode(10,treeNode3,null);//右
        TreeNode treeNode1 = new TreeNode(6,null,treeNode2); //根
        TreeNode root = treeNode1;

        List<Integer> res = preorderTraversal(root);
        res.forEach(System.out::println);


    }



}
