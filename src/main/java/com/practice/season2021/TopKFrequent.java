package com.practice.season2021;

import java.util.*;

/**
 * 692. 前K个高频单词
 * 哈希表
 * https://leetcode-cn.com/problems/top-k-frequent-words/
 */
public class TopKFrequent {
    public List<String> topKFrequent(String[] words, int k) {
        if (words == null || words.length == 0) {
            return new ArrayList<>();
        }

        Map<String, Integer> timesMap = new HashMap<>();
        PriorityQueue<Node> queue = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.times > o2.times) {
                    return -1;
                } else if (o1.times == o2.times) {
                    if (o1.word.compareTo(o2.word) < 0) {
                        return -1;
                    }
                }
                return 1;
            }
        });

        for (String word : words) {
            int times = timesMap.getOrDefault(word, 0) + 1;
            timesMap.put(word, times);
            queue.add(new Node(word, times));
        }

        List<String> ans = new ArrayList<>();
        while (k > 0) {
            String word = queue.poll().word;
            if (!ans.contains(word)) {
                ans.add(word);
                k--;
            }
        }

        return ans;
    }

    private class Node {
        String word;
        int times;
        Node(String word, int times) {
            this.word = word;
            this.times = times;
        }
    }
}
