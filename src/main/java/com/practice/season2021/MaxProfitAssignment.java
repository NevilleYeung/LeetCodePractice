package com.practice.season2021;

/**
 * 826. 安排工作以达到最大收益
 * 双指针
 * https://leetcode-cn.com/problems/most-profit-assigning-work/
 */
public class MaxProfitAssignment {
    /*
    有一些工作：difficulty[i] 表示第 i 个工作的难度，profit[i] 表示第 i 个工作的收益。
    现在我们有一些工人。worker[i] 是第 i 个工人的能力，即该工人只能完成难度小于等于 worker[i] 的工作。
    每一个工人都最多只能安排一个工作，但是一个工作可以完成多次。
    举个例子，如果 3 个工人都尝试完成一份报酬为 1 的同样工作，那么总收益为 $3。如果一个工人不能完成任何工作，他的收益为 $0 。
    我们能得到的最大收益是多少？

    示例：
    输入: difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7]
    输出: 100
    解释: 工人被分配的工作难度是 [4,4,6,6] ，分别获得 [20,20,30,30] 的收益。

    提示:
    1 <= difficulty.length = profit.length <= 10000
    1 <= worker.length <= 10000
    difficulty[i], profit[i], worker[i]  的范围是 [1, 10^5]

    【注意】输入已排好序，但题目没写。
     */
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int ans = 0;

        for (int i = 0; i < worker.length; i++) {
            int left = 0;
            int right = difficulty.length - 1;
            int maxProfit = 0;
            while (left <= right) {
                if (worker[i] >= difficulty[left]) {
                    maxProfit = Math.max(profit[left], maxProfit);
                }
                if (worker[i] >= difficulty[right]) {
                    maxProfit = Math.max(profit[right], maxProfit);
                }
                left++;
                right--;
            }
            ans = ans + maxProfit;
        }

        return ans;
    }
}
