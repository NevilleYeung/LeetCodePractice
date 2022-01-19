package com.questionbank.a2000to2999;

public class MaxConsecutiveAnswers2024 {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int left = 0;
        int right = 0;
        int num = 0;
        int ans = 0;

        // F -> T
        while (right < answerKey.length()) {
            if (answerKey.charAt(right) == 'F') {
                num++;
            }
            if (num <= k) {
                ans = Math.max(ans, right - left + 1);
            }
            right++;

            // num > k
            while (num > k && left < right) {
                if (answerKey.charAt(left) == 'F') {
                    num--;
                }
                left++;
            }
            ans = Math.max(ans, right - left);
        }

        left = 0;
        right = 0;
        num = 0;
        // T -> F
        while (right < answerKey.length()) {
            if (answerKey.charAt(right) == 'T') {
                num++;
            }
            if (num <= k) {
                ans = Math.max(ans, right - left + 1);
            }
            right++;

            // num > k
            while (num > k && left < right) {
                if (answerKey.charAt(left) == 'T') {
                    num--;
                }
                left++;
            }
            ans = Math.max(ans, right - left);
        }

        return ans;
    }

    public static void main(String[] args) {
        MaxConsecutiveAnswers2024 ma = new MaxConsecutiveAnswers2024();

        // 示例 1：
        //输入：answerKey = "TTFF", k = 2
        //输出：4
        //解释：我们可以将两个 'F' 都变为 'T' ，得到 answerKey = "TTTT" 。
        //总共有四个连续的 'T' 。
        String answerKey = "TTFF";
        int k = 2;
        int ans = ma.maxConsecutiveAnswers(answerKey, k);
        System.out.println(ans);

        //示例 2：
        //输入：answerKey = "TFFT", k = 1
        //输出：3
        //解释：我们可以将最前面的 'T' 换成 'F' ，得到 answerKey = "FFFT" 。
        //或者，我们可以将第二个 'T' 换成 'F' ，得到 answerKey = "TFFF" 。
        //两种情况下，都有三个连续的 'F' 。
        answerKey = "TFFT";
        k = 1;
        ans = ma.maxConsecutiveAnswers(answerKey, k);
        System.out.println(ans);

        //示例 3：
        //输入：answerKey = "TTFTTFTT", k = 1
        //输出：5
        //解释：我们可以将第一个 'F' 换成 'T' ，得到 answerKey = "TTTTTFTT" 。
        //或者我们可以将第二个 'F' 换成 'T' ，得到 answerKey = "TTFTTTTT" 。
        //两种情况下，都有五个连续的 'T' 。
        answerKey = "TTFTTFTT";
        k = 1;
        ans = ma.maxConsecutiveAnswers(answerKey, k);
        System.out.println(ans);
    }
}
