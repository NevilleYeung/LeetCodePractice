package com.practice.Oct2018;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest
{

    @Test
    public void addTwoNumbers01()
    {
        // 342 + 465 = 807
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoNumbers atn = new AddTwoNumbers();

        ListNode re = atn.addTwoNumbers(l1, l2);
        while (re != null)
        {
            System.out.print(re.val + " ");
            assertEquals(7, re.val);
            re = re.next;
        }

        System.out.println();

    }

    @Test
    public void addTwoNumbers02()
    {
        // 999 + 1 = 1000
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);

        ListNode l2 = new ListNode(1);


        AddTwoNumbers atn = new AddTwoNumbers();

        ListNode re = atn.addTwoNumbers(l1, l2);
        while (re != null)
        {
            System.out.print(re.val + " ");
            re = re.next;
        }
        System.out.println();
    }

    @Test
    public void addTwoNumbers03()
    {
        // 1 + 999 = 1000
        ListNode l1 = new ListNode(1);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);


        AddTwoNumbers atn = new AddTwoNumbers();

        ListNode re = atn.addTwoNumbers(l1, l2);
        while (re != null)
        {
            System.out.print(re.val + " ");
            re = re.next;
        }
        System.out.println();
    }
}