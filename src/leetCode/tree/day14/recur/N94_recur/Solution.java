package leetCode.tree.day14.recur.N94_recur;



import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 中序遍
 * @Author: llz
 * @Date: 2023/3/13 1:02
 */

public class Solution {

    public static void inorderTrav(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inorderTrav(node.left, list);  //先加左孩子再加右孩子再输出
        list.add(node.val);
        inorderTrav(node.right, list);

    }

    public static List<Integer>  inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderTrav(root, res);
        return res;
    }

    public static void main(String[] args) {
        TreeNode treeNode3 = new TreeNode(3,null,null);
        TreeNode treeNode2 = new TreeNode(2,treeNode3,null);
        TreeNode treeNode1 = new TreeNode(6,null,treeNode2);
        TreeNode root = treeNode1;

        List<Integer> res = inorderTraversal(root);
        res.forEach(System.out::println);
    }

}
