package com.practice.season1_2019;

import com.practice.common.ListNode;

/**
 * 234. 回文链表
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 */
public class PalindromeList
{
    /*
    请判断一个链表是否为回文链表。

    示例 1:
    输入: 1->2
    输出: false

    示例 2:
    输入: 1->2->2->1
    输出: true

    进阶：
    你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
     */
    public boolean isPalindrome(ListNode head)
    {
        if (head == null || head.next == null)
        {
            return true;
        }

        ListNode headTmp = head;
        ListNode slow = headTmp;
        ListNode fast = headTmp;

        // 找到链表中点
        while (fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 循环过后，链表中点即是slow

        // 把后半部分的链表反转
        ListNode halfListHead = slow.next;
        ListNode reverseList = reverseList(halfListHead);

        while (reverseList != null)
        {
            if (reverseList.val != headTmp.val)
            {
                return false;
            }

            reverseList = reverseList.next;
            headTmp = headTmp.next;
        }

        return true;
    }

    /**
     * 从206题搬过来的代码
     * @param head
     * @return
     */
    private ListNode reverseList(ListNode head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }

        ListNode headTmp = head;
        ListNode tmp = null;

        // 记录前中后的node
        ListNode front = null;
        ListNode mid = headTmp;
        ListNode back = headTmp.next;

        while (back != null)
        {
            // 将中间node指向前node
            mid.next = front;

            // 前中后node全部next一下
            tmp = back;
            front = mid;
            mid = back;
            back = tmp.next;
        }

        // 把最后一个节点指向前node
        mid.next = front;

        return mid;
    }
}
