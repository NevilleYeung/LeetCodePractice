package com.practice.season2021;

import com.practice.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 337. 打家劫舍 III
 * DFS/DP
 * https://leetcode-cn.com/problems/house-robber-iii/
 */
public class Rob3 {
    /*
    在上次打劫完一条街道之后和一圈房屋后，小偷又发现了一个新的可行窃的地区。这个地区只有一个入口，我们称之为“根”。 除了“根”之外，每栋房子有且只有一个“父“房子与之相连。一番侦察之后，聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。 如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。
    计算在不触动警报的情况下，小偷一晚能够盗取的最高金额。

    示例 1:
    输入: [3,2,3,null,3,null,1]
         3
        / \
       2   3
        \   \
         3   1
    输出: 7
    解释: 小偷一晚能够盗取的最高金额 = 3 + 3 + 1 = 7.

    示例 2:
    输入: [3,4,5,1,3,null,1]
         3
        / \
       4   5
      / \   \
     1   3   1
    输出: 9
    解释: 小偷一晚能够盗取的最高金额 = 4 + 5 = 9.
     */
    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int[] max = dfs(root);

        return Math.max(max[0], max[1]);
    }

    private int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }

        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        // 0，选中root节点的场景；1，不选root节点的场景
        int[] max = new int[2];
        // 选中root，则不能选两个子节点
        max[0] = root.val + left[1] + right[1];
        // 不选root，则左右子节点的最大值相加
        max[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return max;
    }
}
