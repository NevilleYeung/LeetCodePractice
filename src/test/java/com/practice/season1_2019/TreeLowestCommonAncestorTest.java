package com.practice.season1_2019;

import com.practice.common.TreeNode;
import org.junit.Test;

public class TreeLowestCommonAncestorTest
{
    private TreeLowestCommonAncestor commonAncestor = new TreeLowestCommonAncestor();

    @Test
    public void lowestCommonAncestor()
    {
        /*
             3
           /   \
          5     1
         / \   / \
        6   2  0  8
           / \
          7   4
         */
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);


//        TreeNode re = commonAncestor.lowestCommonAncestor(root , root.left, root.left.right.right);
        TreeNode re = commonAncestor.lowestCommonAncestor(root , root.left.right, root.left.right.right);
        System.out.println(re.val);
    }
}