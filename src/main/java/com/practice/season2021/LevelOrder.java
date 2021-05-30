package com.practice.season2021;

import com.practice.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 102. 二叉树的层序遍历
 * BFS
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 */
public class LevelOrder {
    /*
    给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。

    示例：
    二叉树：[3,9,20,null,null,15,7],
        3
       / \
      9  20
        /  \
       15   7
    返回其层序遍历结果：

    [
      [3],
      [9,20],
      [15,7]
    ]
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        bfs(root, ans);

        return ans;
    }

    private void bfs(TreeNode root, List<List<Integer>> ans) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // 层序遍历
        while (!queue.isEmpty()) {
            int length = queue.size();
            List<Integer> ansList = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                TreeNode node = queue.poll();
                ansList.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            ans.add(ansList);
        }
    }
}
