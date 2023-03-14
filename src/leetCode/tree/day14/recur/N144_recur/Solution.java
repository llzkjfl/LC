package leetCode.tree.day14.recur.N144_recur;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 二叉树的先序遍历
 * @Author: llz
 * @Date: 2023/3/12 23:34
 */

public class Solution {


    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null){return res;}
        preTra(root,res);
        return res;
    }
    public static void preTra(TreeNode root, List<Integer> list) {
        if(root==null)return;
        list.add(root.val);
        if(root.left!=null)
            preTra(root.left,list);
        if(root.right!=null)
            preTra(root.right,list);
    }


    public static void main(String[] args) {
        TreeNode treeNode3 = new TreeNode(3,null,null);
        TreeNode treeNode2 = new TreeNode(2,treeNode3,null);
        TreeNode treeNode1 = new TreeNode(6,null,treeNode2);
        TreeNode root = treeNode1;

        List<Integer> res = preorderTraversal(root);
        res.forEach(System.out::println);
    }


}
