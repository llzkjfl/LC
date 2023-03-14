package LeetCode.tree.day15.N102;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description: 二叉树的层次遍历
 * @Author: llz
 * @Date: 2023/3/14 13:18
 */

public class Solution {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){ return res;}

        Deque<TreeNode> dq = new LinkedList<>();
        dq.offerLast(root);
        TreeNode cur ;
        int len;

        while(!dq.isEmpty()){
            len=dq.size();
            List<Integer> resLevel = new ArrayList<>();
            while(len>0){
                cur =  dq.pollFirst();
                resLevel.add(cur.val);
                if(cur.left!=null)dq.offerLast(cur.left);
                if(cur.right!=null)dq.offerLast(cur.right);
                len--;
            }
            res.add(resLevel);

        }
        return  res;

    }


}
