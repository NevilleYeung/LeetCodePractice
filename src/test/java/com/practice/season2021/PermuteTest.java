package com.practice.season2021;

import org.junit.Test;

import java.rmi.UnmarshalException;
import java.util.List;

import static org.junit.Assert.*;

public class PermuteTest {
    Permute permute = new Permute();

    @Test
    public void permute() {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = permute.permute(nums);
        System.out.println(ans);
    }
}