package LeetCode.tree.day15.N226;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Description:给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 * @Author: llz
 * @Date: 2023/3/14 23:09
 */

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null))return root;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        TreeNode cur;
        int len;
        while(!que.isEmpty()){
            len = que.size();
            List<TreeNode> rever = new ArrayList<>();

            while(len>0){
                cur = que.poll();
                if(cur!=root){
                    rever.add(cur);
                }
                if(cur.left!=null)que.offer(cur.left);
                if(cur.right!=null)que.offer(cur.right);
                len--;
            }
            int lenth = rever.size();
            for(int i=0;i<lenth/2;i++){

                TreeNode pre = rever.get(i) ;
                TreeNode post= rever.get(lenth-1-i);
                cur = pre;
                pre = post;
                post = cur;
            }
        }
        return root;
    }
}
