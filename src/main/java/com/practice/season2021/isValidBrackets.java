package com.practice.season2021;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 20. 有效的括号
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
public class isValidBrackets {
    /*
    给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
    有效字符串需满足：
    左括号必须用相同类型的右括号闭合。
    左括号必须以正确的顺序闭合。

    示例 1：
    输入：s = "()"
    输出：true

    示例 2：
    输入：s = "()[]{}"
    输出：true

    示例 3：
    输入：s = "(]"
    输出：false

    示例 4：
    输入：s = "([)]"
    输出：false

    示例 5：
    输入：s = "{[]}"
    输出：true

    提示：
    1 <= s.length <= 104
    s 仅由括号 '()[]{}' 组成
     */
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            if (cc == '(' || cc == '{' || cc == '[') {
                stack.push(cc);
                continue;
            }

            if (cc == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.poll();
                    continue;
                } else {
                    return false;
                }
            }

            if (cc == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.poll();
                    continue;
                } else {
                    return false;
                }
            }

            if (cc == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.poll();
                    continue;
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
