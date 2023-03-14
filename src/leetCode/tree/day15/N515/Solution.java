package LeetCode.tree.day15.N515;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/14 17:30
 */

public class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> reaMax = new ArrayList<>();
        if(root==null){ return reaMax;}
        Deque<TreeNode> dq = new LinkedList<>();
        dq.offerLast(root);
        TreeNode cur;
        int len;
        int max;
        while(!dq.isEmpty()){
            len = dq.size();
            max = dq.peekFirst().val;
            while(len>0){
                cur = dq.pollFirst();
                if(cur.val>max){ max = cur.val; }
                if(cur.left!=null)dq.offerLast(cur.left);
                if(cur.right!=null)dq.offerLast(cur.right);
                len--;
            }
            reaMax.add(max);
        }
        return reaMax;
    }
}
