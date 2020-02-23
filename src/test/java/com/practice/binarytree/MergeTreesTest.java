package com.practice.binarytree;

import com.practice.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTreesTest {
    MergeTrees mt = new MergeTrees();

    @Test
    public void mergeTrees() {
        /*
        输入:
        Tree 1                     Tree 2
              1                         2
             / \                       / \
            3   2                     1   3
           /                           \   \
          5                             4   7
        输出:
        合并后的树:
                 3
                / \
               4   5
              / \   \
             5   4   7
         */
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);

        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        t2.left.right = new TreeNode(4);
        t2.right.right = new TreeNode(7);

        TreeNode re = mt.mergeTrees(t1, t2);

        System.out.println(re.val);

    }
}