package Leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal2_107 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        traverse(res, root, 0);
        return res;
    }

    public void traverse(List<List<Integer>> res, TreeNode root, int level){
        if (root==null) return;
        if (res.size()==level)
            res.add(0, new ArrayList<Integer>());
        res.get(res.size()-level-1).add(root.val);
        traverse(res, root.left, level+1);
        traverse(res, root.right, level+1);
    }
}
