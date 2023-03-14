package leetCode.tree.day15.N102;

import java.util.*;

/**
 * @Description: 层序遍历
 * @Author: llz
 * @Date: 2023/3/13 14:07
 */

public class Solution {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();  //分成集合
        if (root == null) {
            return res;
        }
        Deque<TreeNode> dq = new LinkedList<>();       //双端队列模拟队列
        dq.offerLast(root);                           //将根节点入队尾
        TreeNode cur;
        int len;
        while (!dq.isEmpty()) {                     //栈不为空

            List<Integer> resLevel = new ArrayList<>();
            len = dq.size();                     //此层个数

            while (len > 0) {
                cur = dq.pollFirst();           //弹出对头
                resLevel.add(cur.val);          //将元素放到队列中
                if (cur.left != null) {         //左孩子入队
                    dq.offerLast(cur.left);
                }
                if (cur.right != null) {        //右孩子入队
                    dq.offerLast(cur.right);
                }
                len--;
            }
            res.add(resLevel);               //每层结束，将此层加入结果集合
        }
        return res;                         //返回结果集
    }








    public static void main(String[] args) {
        TreeNode treeNode3_21 = new TreeNode(99,null,null);
        TreeNode treeNode21 = new TreeNode(10,treeNode3_21,null);
        TreeNode treeNode3 = new TreeNode(3,null,null);
        TreeNode treeNode22 = new TreeNode(2,treeNode3,null);
        TreeNode treeNode1 = new TreeNode(6,treeNode21,treeNode22);
        TreeNode root = treeNode1;


        List<List<Integer>> lists = levelOrder(root);
       lists.forEach(System.out::println);

    }
}
