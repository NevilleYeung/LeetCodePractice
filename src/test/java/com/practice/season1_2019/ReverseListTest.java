package com.practice.season1_2019;

import com.practice.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseListTest
{
    private ReverseList reverseList = new ReverseList();

    @Test
    public void reverseList()
    {
//        ListNode head =null;

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode re = reverseList.reverseList(head);
        while (re != null)
        {
            System.out.println(re.val);
            re = re.next;
        }

    }

    @Test
    public void reverseList01()
    {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);

        ListNode re = reverseList.reverseList01(head);
        while (re != null)
        {
            System.out.println(re.val);
            re = re.next;
        }

    }
}