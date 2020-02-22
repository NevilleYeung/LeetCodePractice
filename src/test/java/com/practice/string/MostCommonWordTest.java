package com.practice.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class MostCommonWordTest {

    MostCommonWord mostCommonWord = new MostCommonWord();

    @Test
    public void mostCommonWord() {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it,was,hit.";
        String[] banned = {"hit"};
        String word = mostCommonWord.mostCommonWord(paragraph, banned);

        assertEquals("ball", word);
    }

    @Test
    public void mostCommonWord2() {
        String paragraph = "a, a, a, a, b.b,b,c, c";
        String[] banned = {"a"};
        String word = mostCommonWord.mostCommonWord(paragraph, banned);

        assertEquals("b", word);
    }
}