package LeetCode.tree.day14.itera.N94;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/13 1:01
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
