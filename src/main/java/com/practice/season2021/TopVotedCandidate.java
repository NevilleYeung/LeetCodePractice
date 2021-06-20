package com.practice.season2021;

import java.util.*;

class TopVotedCandidate {
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
