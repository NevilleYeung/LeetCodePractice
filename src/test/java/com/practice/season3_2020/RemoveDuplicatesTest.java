package com.practice.season3_2020;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest {

    @Test
    public void removeDuplicates() {
        RemoveDuplicates rd = new RemoveDuplicates();

        int [] nums = {1, 1, 2};
        System.out.println(rd.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

        System.out.println("==================");


        nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(rd.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}