package com.practice.season2021;

import com.practice.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindBottomLeftValueTest {
    private FindBottomLeftValue fblv = new FindBottomLeftValue();

    @Test
    public void findBottomLeftValue() {
        TreeNode t1 = new TreeNode(2);
        t1.left = new TreeNode(1);
        t1.right = new TreeNode(3);
        int ans = fblv.findBottomLeftValue(t1);
        System.out.println(ans);


        t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.left = new TreeNode(4);
        t1.right.left = new TreeNode(5);
        t1.right.right = new TreeNode(6);
        t1.right.left.left = new TreeNode(7);
        ans = fblv.findBottomLeftValue(t1);
        System.out.println(ans);
    }
}