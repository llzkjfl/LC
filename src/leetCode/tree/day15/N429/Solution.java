package LeetCode.tree.day15.N429;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/14 16:40
 */


public class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null)return res;
        Deque<Node> dq = new LinkedList<>();
        dq.offerLast(root);
        Node cur;
        int len,lenLevel;
        while(!dq.isEmpty()){
            len=dq.size();                                      //总层数
            List<Integer> resLevel = new ArrayList<>();         //层结果集

            while(len>0){
                cur = dq.pollFirst();                 //弹出对头(父)
                resLevel.add(cur.val);                //加入层结果集
                if(cur.children!=null){               //孩子不为空 孩子Dq入队
                    lenLevel =  cur.children.size();
                    for(int i=0;i<lenLevel;i++){
                        dq.offerLast(cur.children.get(i));
                    }
                }
                len--;
            }
            res.add(resLevel);                              //每层结束将次层加入总集合
        }
        return res;
    }
}




/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;
    public Node() {}
    public Node(int _val) {
        val = _val;
    }
    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/