package com.practice.season1_2019;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeMaxDepthTest
{
    BinaryTreeMaxDepth binaryTreeMaxDepth = new BinaryTreeMaxDepth();

    @Test
    public void maxDepth()
    {
        /*
            3
           / \
          9  20
            /  \
           15   7
         */
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);


        int maxDepth = binaryTreeMaxDepth.maxDepth(root);
        System.out.println(maxDepth);

    }
}