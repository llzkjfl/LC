package leetCode.tree.day14.recur.N145_recur;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 后续遍历
 * @Author: llz
 * @Date: 2023/3/13 0:31
 */

public class Solution {


//    public static void inorderTrav(TreeNode node, List<Integer> list) {
//        if (node == null) return;
//        inorderTrav(node.left, list);  //先加左孩子再加右孩子再输出
//        list.add(node.val);
//        inorderTrav(node.right, list);
//
//    }
//
//    public static List<Integer>  inorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        inorderTrav(root, res);
//        return res;
//    }
    public static void main(String[] args) {
        TreeNode treeNode4 = new TreeNode(5,null,null);
        TreeNode treeNode2 = new TreeNode(7,null,null);
        TreeNode treeNode3 = new TreeNode(6,treeNode4,treeNode2);
        TreeNode treeNode1 = new TreeNode(1,null,treeNode3);
        TreeNode root = treeNode1;

        List<Integer> res = postorderTraversal(root);
        res.forEach(System.out::println);
    }

    public static void postTrav(TreeNode node, List<Integer> list) {
        if(node==null)return;;
        if(node.left!=null)postTrav(node.left,list);
        if(node.right!=null)postTrav(node.right,list);
        list.add(node.val);

    }
    public static List<Integer>  postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root==null)return res;
        postTrav(root,res);
        return  res;
    }
}
