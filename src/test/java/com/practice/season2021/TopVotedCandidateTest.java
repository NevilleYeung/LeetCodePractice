package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class TopVotedCandidateTest {

    @Test
    public void q() {
        int[] persons = {0,1,1,0,0,1,0};
        int[] times = {0,5,10,15,20,25,30};
        TopVotedCandidate tvc = new TopVotedCandidate(persons, times);

        int ans = tvc.q(3);
        System.out.println("ans=" + ans);
        ans = tvc.q(12);
        System.out.println("ans=" + ans);
        ans = tvc.q(25);
        System.out.println("ans=" + ans);
        ans = tvc.q(15);
        System.out.println("ans=" + ans);
        ans = tvc.q(24);
        System.out.println("ans=" + ans);
        ans = tvc.q(8);
        System.out.println("ans=" + ans);

        System.out.println();

        persons = new int[]{0,0,0,0,0,0,1};
        times = new int[]{0,5,10,15,20,25,30};
        tvc = new TopVotedCandidate(persons, times);

        ans = tvc.q(3);
        System.out.println("ans=" + ans);
        ans = tvc.q(12);
        System.out.println("ans=" + ans);
        ans = tvc.q(25);
        System.out.println("ans=" + ans);
        ans = tvc.q(15);
        System.out.println("ans=" + ans);
        ans = tvc.q(24);
        System.out.println("ans=" + ans);
        ans = tvc.q(8);
        System.out.println("ans=" + ans);

    }
}