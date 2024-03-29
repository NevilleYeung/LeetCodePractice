package com.practice.season2021;

import com.practice.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 230. 二叉搜索树中第K小的元素
 * dfs
 * https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/
 */
public class KthSmallestTree {
    /*
    给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 个最小元素（从 1 开始计数）。

    示例 1：
    输入：root = [3,1,4,null,2], k = 1
    输出：1

    示例 2：
    输入：root = [5,3,6,2,4,null,null,1], k = 3
    输出：3
     
    提示：
    树中的节点数为 n 。
    1 <= k <= n <= 104
    0 <= Node.val <= 104

    进阶：如果二叉搜索树经常被修改（插入/删除操作）并且你需要频繁地查找第 k 小的值，你将如何优化算法？
     */
    public int kthSmallest(TreeNode root, int k) {
        List<TreeNode> list = new ArrayList<>();
        dfs(root, k, list);
        return list.get(k - 1).val;
    }

    private void dfs(TreeNode root, int k, List<TreeNode> list) {
        if (root == null || list.size() == k) {
            return;
        }

        if (root.left != null) {
            dfs(root.left, k, list);
        }

        list.add(root);

        if (root.right != null) {
            dfs(root.right, k, list);
        }
    }
}
