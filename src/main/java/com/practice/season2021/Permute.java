package com.practice.season2021;

import java.util.*;

/**
 * 46. 全排列
 * DFS
 * https://leetcode-cn.com/problems/permutations/
 */
public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] seen = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        Deque<Integer> tmpResult = new LinkedList<>();

        dfs(nums, tmpResult, ans, seen);

        return ans;
    }

    private void dfs(int[] nums, Deque<Integer> tmpResult, List<List<Integer>> ans, boolean[] seen) {
        if (tmpResult.size() == nums.length) {
            ans.add(new LinkedList<>(tmpResult));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (seen[i]) {
                continue;
            }

            tmpResult.add(nums[i]);
            seen[i] = true;
            dfs(nums, tmpResult, ans, seen);

            // 回溯
            seen[i] = false;
            tmpResult.pollLast();
        }
    }
}
