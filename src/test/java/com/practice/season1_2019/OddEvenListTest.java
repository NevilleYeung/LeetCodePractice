package com.practice.season1_2019;

import com.practice.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenListTest
{
    private OddEvenList oddEvenList = new OddEvenList();

    @Test
    public void oddEvenList()
    {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode re = oddEvenList.oddEvenList(head);
        if (re == null)
        {
            System.out.println("re is " + re);
            return;
        }
        while (re != null)
        {
            System.out.println(re.val);
            re = re.next;
        }

    }

    @Test
    public void oddEvenList01()
    {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode re = oddEvenList.oddEvenList01(head);
        if (re == null)
        {
            System.out.println("re is " + re);
            return;
        }
        while (re != null)
        {
            System.out.println(re.val);
            re = re.next;
        }

    }
}