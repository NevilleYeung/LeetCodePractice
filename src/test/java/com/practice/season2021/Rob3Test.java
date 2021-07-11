package com.practice.season2021;

import com.practice.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Rob3Test {
    Rob3 rob3 = new Rob3();

    @Test
    public void rob() {
        /*
         3
        / \
       2   3
        \   \
         3   1
         */
        TreeNode t1 = new TreeNode(3);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.right = new TreeNode(3);
        t1.right.right = new TreeNode(1);
        int ans = rob3.rob(t1);
        System.out.println(ans);


        /*
         3
        / \
       4   5
      / \   \
     1   3   1
         */
        TreeNode t2 = new TreeNode(3);
        t2.left = new TreeNode(4);
        t2.right = new TreeNode(5);
        t2.left.left = new TreeNode(1);
        t2.left.right = new TreeNode(3);
        t2.right.right = new TreeNode(1);
        ans = rob3.rob(t2);
        System.out.println(ans);
    }
}