package LeetCode.tree.day15.N429;

import java.util.List;

/**
 * @Description: 二叉树的java定义
 * @Author: llz
 * @Date: 2023/3/12 23:31
 */

public class Node {
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
}
