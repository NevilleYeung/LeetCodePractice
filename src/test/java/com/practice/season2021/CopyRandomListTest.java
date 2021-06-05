package com.practice.season2021;

import com.practice.common.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class CopyRandomListTest {
    CopyRandomList crl = new CopyRandomList();

    @Test
    public void copyRandomList() {
        Node node7 = new Node(7);
        Node node13 = new Node(13);
        Node node11 = new Node(11);
        Node node10 = new Node(10);
        Node node1 = new Node(1);

        node7.next = node13;
        node13.next = node11;
        node11.next = node10;
        node10.next = node1;

        node13.random = node7;
        node11.random = node1;
        node10.random = node11;
        node1.random = node7;

        Node ans = crl.copyRandomList(node7);
        System.out.println(ans);

    }
}