package com.practice.season2021;

import com.practice.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 513. 找树左下角的值
 * BFS
 * https://leetcode-cn.com/problems/find-bottom-left-tree-value/
 */
public class FindBottomLeftValue {
    /*
    给定一个二叉树，在树的最后一行找到最左边的值。

    示例 1:
    输入:
        2
       / \
      1   3

    输出:
    1

    示例 2:
    输入:
            1
           / \
          2   3
         /   / \
        4   5   6
           /
          7

    输出:
    7

    注意: 您可以假设树（即给定的根节点）不为 NULL。
     */
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int ans = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode tt = queue.poll();
                if (i == 0) {
                    ans = tt.val;
                }

                if (tt.left != null) {
                    queue.offer(tt.left);
                }
                if (tt.right != null) {
                    queue.offer(tt.right);
                }
            }
        }


        return ans;
    }
}
