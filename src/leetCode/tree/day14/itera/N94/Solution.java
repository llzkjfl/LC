package leetCode.tree.day14.itera.N94;



import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description: 中序遍
 * @Author: llz
 * @Date: 2023/3/13 1:02
 */

public class Solution {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> dq = new LinkedList<>();
        TreeNode cur = root;               //当前结点
        while (cur != null || !dq.isEmpty()) {   //结点空或栈空最多只有一个出现
            if (cur != null) {                  //结点不空 就将结点所有子节点入栈
                dq.offerLast(cur);
                cur = cur.left;
            } else {                         //结点空时，表明父节点(栈顶元素)无左孩子，弹出父节点
                cur = dq.pollLast();
                res.add(cur.val);
                cur = cur.right;            //指向右孩子
            }
        }
        return res;                         //返回集合
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
