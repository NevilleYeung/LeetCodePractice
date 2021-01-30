package com.practice.season2021;

import com.practice.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class InvertTreeTest {
    private InvertTree it = new InvertTree();

    @Test
    public void invertTree() {
        /*
        输入:
        Tree 1
              1
             / \
            3   2
           /
          5
        输出:

         */
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);

        TreeNode re = it.invertTree(t1);

        System.out.println(re.val);

    }
}