package com.practice.season2021;

import com.practice.common.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LargestValuesTest {
    LargestValues lv = new LargestValues();

    @Test
    public void largestValues() {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);
        t1.left.right = new TreeNode(3);
        t1.right.right = new TreeNode(9);
        List<Integer> ans = lv.largestValues(t1);
        System.out.println(ans);
    }
}