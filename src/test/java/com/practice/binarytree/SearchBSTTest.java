package com.practice.binarytree;

import com.practice.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchBSTTest {
    SearchBST searchBST = new SearchBST();

    @Test
    public void searchBST() {
        TreeNode t1 = new TreeNode(4);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(7);
        t1.left.left = new TreeNode(1);
        t1.left.right = new TreeNode(3);

        TreeNode re = searchBST.searchBST(t1, 2);

        System.out.println(re);
    }
}