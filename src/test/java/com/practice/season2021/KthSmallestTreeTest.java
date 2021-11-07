package com.practice.season2021;

import com.practice.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class KthSmallestTreeTest {
    KthSmallestTree kst = new KthSmallestTree();

    @Test
    public void kthSmallest() {
        // 输入：root = [3,1,4,null,2], k = 1
        //输出：1
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        int ans = kst.kthSmallest(root, 1);
        System.out.println(ans);

        // 输入：root = [5,3,6,2,4,null,null,1], k = 3
        //输出：3
        root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        ans = kst.kthSmallest(root, 3);
        System.out.println(ans);
    }
}