package com.practice.season2021;

import com.practice.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1305. 两棵二叉搜索树中的所有元素
 * DFS
 * https://leetcode-cn.com/problems/all-elements-in-two-binary-search-trees/
 */
public class GetAllElements {
    /*
    给你 root1 和 root2 这两棵二叉搜索树。
    请你返回一个列表，其中包含 两棵树 中的所有整数并按 升序 排序。.

    示例 1：
    // 图略
    输入：root1 = [2,1,4], root2 = [1,0,3]
    输出：[0,1,1,2,3,4]

    示例 2：
    输入：root1 = [0,-10,10], root2 = [5,1,7,0,2]
    输出：[-10,0,0,1,2,5,7,10]

    示例 3：
    输入：root1 = [], root2 = [5,1,7,0,2]
    输出：[0,1,2,5,7]

    示例 4：
    输入：root1 = [0,-10,10], root2 = []
    输出：[-10,0,10]

    示例 5：
    // 图略
    输入：root1 = [1,null,8], root2 = [8,1]
    输出：[1,1,8,8]

    提示：
    每棵树最多有 5000 个节点。
    每个节点的值在 [-10^5, 10^5] 之间。
     */
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans = new ArrayList<>();

        if (root1 != null) {
            dfs(root1, ans);
        }

        if (root2 != null) {
            dfs(root2, ans);
        }

        Collections.sort(ans);
        return ans;
    }

    private void dfs(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            dfs(root.left, list);
        }

        list.add(root.val);

        if (root.right != null) {
            dfs(root.right, list);
        }
    }
}
