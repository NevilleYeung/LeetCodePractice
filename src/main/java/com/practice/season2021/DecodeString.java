package com.practice.season2021;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 394. 字符串解码
 * 栈
 * https://leetcode-cn.com/problems/decode-string/
 */
public class DecodeString {
    public String decodeString(String s) {
        Deque<String> stack = new ArrayDeque<>();
        int index = 0;
        while (index < s.length()) {
            char cc = s.charAt(index);
            if (Character.isDigit(cc)) {
                StringBuilder sb = new StringBuilder();
                while (Character.isDigit(cc)) {
                    sb.append(cc);
                    index++;
                    cc = s.charAt(index);
                }
                stack.push(sb.toString());
            } else if (Character.isLetter(cc) || cc == '[') {
                stack.push(String.valueOf(cc));
                index++;
            } else {
                index++;

                List<String> list = new ArrayList<>();
                while (!stack.peek().equals("[")) {
                    list.add(stack.poll());
                }
                stack.poll(); // 去掉“[”

                // 计算次数
                int num = Integer.parseInt(stack.poll());
                StringBuilder sb = new StringBuilder();
                for (int i = list.size() - 1; i >= 0; i--) {
                    sb.append(list.get(i));
                }
                String str = sb.toString();
                for (int i = 1; i < num; i++) {
                    sb.append(str);
                }

                stack.push(sb.toString());
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.pollLast());
        }

        return ans.toString();
    }
}
