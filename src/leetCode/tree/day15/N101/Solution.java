package LeetCode.tree.day15.N101;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/14 23:57
 */

public class Solution {//如果有null添加每层对称相等
    public boolean isSymmetric(TreeNode root) {
        return compare(root.left,root.right);
    }


    public boolean compare(TreeNode left,TreeNode right){
        if(left==null&&right!=null){return false;}
        else if(left!=null&&right==null){return false;}
        else if(left==null&&right==null){return true;}

        boolean outSide = compare(left.left,right.right);
        boolean inSide = compare(left.right,right.left);
        return outSide&&inSide;
    }
}
