package com.practice.season2021;

import com.practice.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 515. 在每个树行中找最大值
 * BFS
 * https://leetcode-cn.com/problems/find-largest-value-in-each-tree-row/
 */
public class LargestValues {
    /*
    您需要在二叉树的每一行中找到最大的值。

    示例：
    输入:
              1
             / \
            3   2
           / \   \
          5   3   9
    输出: [1, 3, 9]
     */
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> ans = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int max = Integer.MIN_VALUE;
            int length = queue.size();

            for (int i = 0; i < length; i++) {
                TreeNode node = queue.poll();
                max = Math.max(max, node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            ans.add(max);
        }

        return ans;
    }
}
