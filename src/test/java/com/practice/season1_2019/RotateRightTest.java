package com.practice.season1_2019;

import com.practice.common.ListNode;
import org.junit.Test;

public class RotateRightTest
{
    private RotateRight rotateRight = new RotateRight();

    @Test
    public void rotateRight00()
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

    @Test
    public void rotateRight01()
    {
        ListNode list = new ListNode(0);
        list.next = new ListNode(1);
        list.next.next = new ListNode(2);

        ListNode result = rotateRight.rotateRight(list, 4);
        while (result != null)
        {
            System.out.println(result.val);
            result = result.next;
        }

    }
}