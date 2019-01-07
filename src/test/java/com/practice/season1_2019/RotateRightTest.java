package com.practice.season1_2019;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateRightTest
{
    private RotateRight rotateRight = new RotateRight();

    @Test
    public void rotateRight()
    {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);

        ListNode result = rotateRight.rotateRight(list, 2);
        while (result != null)
        {
            System.out.println(result.val);
            result = result.next;
        }

    }
}