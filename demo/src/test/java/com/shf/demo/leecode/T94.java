package com.shf.demo.leecode;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class T94 {
    public List<Integer> inorderTraversal2(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }


    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        accessTree(root, res);
        return res;
    }

    public void accessTree(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        accessTree(root.left, res);
        res.add(root.val);
        accessTree(root.right, res);
    }
}
