package LeetCode.tree.day15.N102;

/**
 * @Description: 二叉树的java定义
 * @Author: llz
 * @Date: 2023/3/12 23:31
 */

public class TreeNode {
    int val;
    //构造方法
    TreeNode left,right;
    TreeNode(){ }
    TreeNode(int val){this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
