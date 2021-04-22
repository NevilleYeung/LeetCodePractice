package com.practice.season2021;

import com.practice.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 113. 路径总和 II
 * [dfs]
 * https://leetcode-cn.com/problems/path-sum-ii/
 */
public class PathSum {
    /*
    给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
    叶子节点 是指没有子节点的节点。

    示例 1：
                      5
                    /  \
                   4    8
                  /    / \
                 11   13  4
                / \      / \
               7   2    5   1

    输入：root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
    输出：[[5,4,11,2],[5,8,4,5]]

    示例 2：
                     1
                    /  \
                   2    3
    输入：root = [1,2,3], targetSum = 5
    输出：[]

    示例 3：
    // 图略
    输入：root = [1,2], targetSum = 0
    输出：[]

    提示：
    树中节点总数在范围 [0, 5000] 内
    -1000 <= Node.val <= 1000
    -1000 <= targetSum <= 1000


     */
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return new ArrayList<>();
        }

        TreeNode node = root;
        List<TreeNode> treeList = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();


        dfs(node, treeList, result, 0, targetSum);



        return result;
    }

    private void dfs(TreeNode node, List<TreeNode> treeList, List<List<Integer>> result, int sum, int targetSum) {
        sum = sum + node.val;
        treeList.add(node);
        if (node.left == null && node.right == null) {
            if (sum == targetSum) {
                List<Integer> re = new ArrayList<>();
                for (int i = 0; i < treeList.size(); i++) {
                    re.add(treeList.get(i).val);
                }

                result.add(re);
            }

            return;
        }


        if (node.left != null) {
            List<TreeNode> leftList = new ArrayList<>();
            leftList.addAll(treeList);
            dfs(node.left, leftList, result, sum, targetSum);
        }
        if (node.right != null) {
            List<TreeNode> rightList = new ArrayList<>();
            rightList.addAll(treeList);
            dfs(node.right, rightList, result, sum, targetSum);
        }
    }
}
