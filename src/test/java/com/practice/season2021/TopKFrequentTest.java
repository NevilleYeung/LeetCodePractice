package com.practice.season2021;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TopKFrequentTest {
    TopKFrequent tkf = new TopKFrequent();

    @Test
    public void topKFrequent() {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> ans = tkf.topKFrequent(words, k);
        System.out.println(ans);

        words = new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        k = 4;
        ans = tkf.topKFrequent(words, k);
        System.out.println(ans);

        words = new String[]{"the"};
        k = 1;
        ans = tkf.topKFrequent(words, k);
        System.out.println(ans);

        words = new String[]{"the", "aaa"};
        k = 2;
        ans = tkf.topKFrequent(words, k);
        System.out.println(ans);
    }

//    @Test
//    public void topKFrequent1() {
//        String s1 = "afdsa";
//        String s2 = "afaa";
//        System.out.println(s1.compareTo(s2));
//    }
}