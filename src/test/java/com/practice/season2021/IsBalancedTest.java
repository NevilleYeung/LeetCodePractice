package com.practice.season2021;

import com.practice.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsBalancedTest {
    IsBalanced ib = new IsBalanced();

    @Test
    public void isBalanced() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        boolean ans;
        ans = ib.isBalanced(root);
        System.out.println(ans);

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
        ans = ib.isBalanced(root);
        System.out.println(ans);
    }
}