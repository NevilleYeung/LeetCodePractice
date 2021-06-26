package com.practice.season2021;

import com.practice.common.TreeNode;

/**
 * 101. 对称二叉树
 * DFS
 * https://leetcode-cn.com/problems/symmetric-tree/
 */
public class IsSymmetric {
    /*
    给定一个二叉树，检查它是否是镜像对称的。
    例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

        1
       / \
      2   2
     / \ / \
    3  4 4  3

    但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
        1
       / \
      2   2
       \   \
       3    3

    进阶：
    你可以运用递归和迭代两种方法解决这个问题吗？
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left == null) {
            if (root.right == null) {
                return true;
            } else {
                return false;
            }
        }
        if (root.right == null) {
            return false;
        }

        if (root.left.val != root.right.val) {
            return false;
        }

        boolean ans = isEquel(root.left, root.right);

        return ans;
    }

    private boolean isEquel(TreeNode left, TreeNode right) {
        if (left == null) {
            if (right == null) {
                return true;
            } else {
                return false;
            }
        }
        if (right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        boolean ans = isEquel(left.left, right.right) && isEquel(left.right, right.left);

        return ans;
    }
}
