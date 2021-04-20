package com.practice.season2021;

import com.practice.common.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PathSumTest {
    PathSum pathSum = new PathSum();

    @Test
    public void pathSum() {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        List<List<Integer>> re = pathSum.pathSum(root, 22);
        for (List<Integer> list: re) {
            System.out.println(list);
        }
        System.out.println("======================");

        // 2
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        re = pathSum.pathSum(root, 5);
        for (List<Integer> list: re) {
            System.out.println(list);
        }
        System.out.println("======================");

        // 3
        root = new TreeNode(1);
        root.left = new TreeNode(2);

        re = pathSum.pathSum(root, 0);
        for (List<Integer> list: re) {
            System.out.println(list);
        }
        System.out.println("======================");
    }
}