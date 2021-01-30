package com.practice.season2021;

import com.practice.common.TreeNode;

/**
 * 226. 翻转二叉树
 * https://leetcode-cn.com/problems/invert-binary-tree/
 */
public class InvertTree {
    /*
    翻转一棵二叉树。
    示例：

    输入：
         4
       /   \
      2     7
     / \   / \
    1   3 6   9
    输出：
         4
       /   \
      7     2
     / \   / \
    9   6 3   1
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode right = root.right;
        TreeNode left = root.left;

        // 反转两个子节点
        root.right = left;
        root.left = right;

        // 递归反转左右子树
        invertTree(root.right);
        invertTree(root.left);

        return root;
    }
}
