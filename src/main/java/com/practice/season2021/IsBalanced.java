package com.practice.season2021;

import com.practice.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 110. 平衡二叉树
 * https://leetcode-cn.com/problems/balanced-binary-tree/
 */
public class IsBalanced {
    /*
    给定一个二叉树，判断它是否是高度平衡的二叉树。
    本题中，一棵高度平衡二叉树定义为：
    一个二叉树每个节点的左右两个子树的高度差的绝对值不超过 1 。

    示例 1：
    输入：root = [3,9,20,null,null,15,7]
    输出：true

    示例 2：
    输入：root = [1,2,2,3,3,null,null,4,4]
    输出：false

    示例 3：
    输入：root = []
    输出：true

    提示：
    树中的节点数在范围 [0, 5000] 内
    -104 <= Node.val <= 104
     */
    private List<Boolean> booleans = new ArrayList<>();

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        dfs(root);

        return !booleans.contains(false);
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDeepth = 0;
        int rightDeepth = 0;

        if (root.left != null) {
            leftDeepth = dfs(root.left);
        }
        if (root.right != null) {
            rightDeepth = dfs(root.right);
        }

        if (Math.abs(leftDeepth - rightDeepth) <= 1) {
            booleans.add(true);
        } else {
            booleans.add(false);
        }

        return Math.max(rightDeepth, leftDeepth) + 1;
    }
}
