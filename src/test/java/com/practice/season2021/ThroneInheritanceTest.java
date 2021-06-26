package com.practice.season2021;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.Assert.*;

public class ThroneInheritanceTest {

    @Test
    public void getInheritanceOrder() {
        ThroneInheritance ti = new ThroneInheritance("king");
        ti.birth("king", "andy");
        ti.birth("king", "bob");
        ti.birth("king", "catherine");
        ti.birth("andy", "matthew");
        ti.birth("bob", "alex");
        ti.birth("bob", "asha");

        List<String> ans = ti.getInheritanceOrder();
        System.out.println(ans);

        ti.death("bob");

        ans = ti.getInheritanceOrder();
        System.out.println(ans);
    }


//    public List<String> getInheritanceOrder() {
//        List<String> ans = new ArrayList<>();
//        if (!deadPersion.contains(king)) {
//            ans.add(king);
//        }
//
//        Queue<String> queue = new LinkedList<>();
//        queue.offer(king);
//
//        while (!queue.isEmpty()) {
//            int len = queue.size();
//            for (int i = 0; i < len; i++) {
//                String parent = queue.poll();
//                int parentIndex = ans.indexOf(parent);
//
//                ans.add(parentIndex, parent);
//                parentIndex++;
//
//                List<String> kidKids = family.get(parent);
//                if (kidKids != null && kidKids.size() > 0) {
//                    for (String name: kidKids) {
//                        queue.offer(name);
//                    }
//                }
//
//            }
//        }
//
//        return ans;
//    }
}