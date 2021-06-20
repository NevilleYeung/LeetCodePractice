package com.practice.season2021;

import java.util.*;

/**
 * 911. 在线选举
 * 哈希表
 * https://leetcode-cn.com/problems/online-election/
 */
class TopVotedCandidate {
    /*
    在选举中，第 i 张票是在时间为 times[i] 时投给 persons[i] 的。
    现在，我们想要实现下面的查询函数： TopVotedCandidate.q(int t) 将返回在 t 时刻主导选举的候选人的编号。
    在 t 时刻投出的选票也将被计入我们的查询之中。在平局的情况下，最近获得投票的候选人将会获胜。

    示例：
    输入：["TopVotedCandidate","q","q","q","q","q","q"], [[[0,1,1,0,0,1,0],[0,5,10,15,20,25,30]],[3],[12],[25],[15],[24],[8]]
    输出：[null,0,1,1,0,0,1]
    解释：
    时间为 3，票数分布情况是 [0]，编号为 0 的候选人领先。
    时间为 12，票数分布情况是 [0,1,1]，编号为 1 的候选人领先。
    时间为 25，票数分布情况是 [0,1,1,0,0,1]，编号为 1 的候选人领先（因为最近的投票结果是平局）。
    在时间 15、24 和 8 处继续执行 3 个查询。

    提示：
        1 <= persons.length = times.length <= 5000
        0 <= persons[i] <= persons.length
        times 是严格递增的数组，所有元素都在 [0, 10^9] 范围中。
        每个测试用例最多调用 10000 次 TopVotedCandidate.q。
        TopVotedCandidate.q(int t) 被调用时总是满足 t >= times[0]。
     */
    private int[] times;
    List<Person> topPersons;

    public TopVotedCandidate(int[] persons, int[] times) {
        this.times = times;

        topPersons = new ArrayList<>();
        Map<Integer, Integer> personTimes = new HashMap<>();

        PriorityQueue<Person> queue = new PriorityQueue<>((o1, o2) -> {
            if (o1.tickets > o2.tickets) {
                return -1;
            } else if (o1.tickets == o2.tickets) {
                if (o1.lasttime > o2.lasttime) {
                    return -1;
                }
            }
            return 1;
        });

        for (int i = 0; i < times.length; i++) {
            int tt = personTimes.getOrDefault(persons[i], 0) + 1;
            personTimes.put(persons[i], tt);

            queue.add(new Person(persons[i], tt, times[i]));

            topPersons.add(queue.peek());
        }
    }

    public int q(int t) {
        if (topPersons.size() == 0) {
            return 0;
        }

        int timeIndex = 0;
        int left = 0;
        int right = times.length - 1;
        int middle = 0;

        while (left <= right) {
            middle = left + ((right - left) / 2);
            if (times[middle] == t) {
                timeIndex = middle;
                break;
            } else if (t < times[middle]) {
                right = middle - 1;
            } else {
                timeIndex = middle;
                left = middle + 1;
            }
        }

        return topPersons.get(timeIndex).id;
    }

    private class Person {
        int id;
        int tickets;
        int lasttime;
        Person(int id, int tickets, int lasttime) {
            this.id = id;
            this.tickets = tickets;
            this.lasttime = lasttime;
        }
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */
