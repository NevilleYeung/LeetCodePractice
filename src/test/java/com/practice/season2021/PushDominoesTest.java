package com.practice.season2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class PushDominoesTest {
    PushDominoes pd = new PushDominoes();

    @Test
    public void pushDominoes() {

        String dominoes = ".L.R...LR..L..";
        String ans = pd.pushDominoes(dominoes);
        System.out.println(ans);


        dominoes = "RR.L";
        ans = pd.pushDominoes(dominoes);
        System.out.println(ans);

    }
}