package com.practice.season2021;

import com.practice.common.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LevelOrderTest {
    LevelOrder lo = new LevelOrder();

    @Test
    public void levelOrder() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> ans = lo.levelOrder(root);
        System.out.println(ans);
    }
}