package com.practice.season2_2020;

import org.junit.Test;

import static org.junit.Assert.*;

public class NextGreatestLetterTest {
    private NextGreatestLetter ngl = new NextGreatestLetter();

    @Test
    public void nextGreatestLetter() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char re;

        re = ngl.nextGreatestLetter(letters, target);
        System.out.println("re = " + re);
    }
}