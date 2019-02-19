package com.practice.season1_2019;

import com.practice.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeListTest
{
    private PalindromeList palindromelist = new PalindromeList();

    @Test
    public void isPalindrome()
    {
//        ListNode head = null;

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
//        head.next.next.next = new ListNode(1);
//        head.next.next.next.next = new ListNode(5);

        boolean re = palindromelist.isPalindrome(head);
        System.out.println(re);
    }
}