package com.practice.season2021;

import java.util.*;

/**
 * 1462. 课程表 IV
 * BFS/DFS
 * https://leetcode-cn.com/problems/course-schedule-iv/
 */
public class CheckIfPrerequisite {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        Map<Integer, Set<Integer>> ansMap = new HashMap<>();

        for (int i = 0; i < prerequisites.length; i++) {
            Set<Integer> queue = map.getOrDefault(prerequisites[i][0], new HashSet<>());
            queue.add(prerequisites[i][1]);

            map.put(prerequisites[i][0], queue);
        }

        bfs(numCourses, map, ansMap);

        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            Set<Integer> lessons = ansMap.get(queries[i][0]);

            if (lessons == null || lessons.isEmpty() || !lessons.contains(queries[i][1])) {
                ans.add(false);
            } else {
                ans.add(true);
            }
        }

        return ans;
    }

    private void bfs(int numCourses, Map<Integer, Set<Integer>> map, Map<Integer, Set<Integer>> ansMap) {
        Set<Map.Entry<Integer, Set<Integer>>> entries = map.entrySet();

        for (Map.Entry<Integer, Set<Integer>> entry : entries) {
            boolean[] seen = new boolean[numCourses];
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(entry.getKey());

            Set<Integer> ansSet = ansMap.getOrDefault(entry.getKey(), new HashSet<>());

            while (!queue.isEmpty()) {
                Integer key = queue.poll();
                Set<Integer> value = map.get(key);

                if (value == null || value.isEmpty()) {
                    continue;
                }

                for (Integer lesson: value) {
                    if (seen[lesson]) continue;
                    seen[lesson] = true;

                    ansSet.add(lesson);
                    queue.offer(lesson);
                }

                ansMap.put(entry.getKey(), ansSet);
            }
        }
    }
}
