package com.practice.season1_2019;

import com.practice.common.ListNode;

/**
 * 206. 反转链表
 * https://leetcode-cn.com/problems/reverse-linked-list/comments/
 */
public class ReverseList
{
    /*
    反转一个单链表。

    示例:
    输入: 1->2->3->4->5->NULL
    输出: 5->4->3->2->1->NULL

    进阶:
    你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
     */
    public ListNode reverseList(ListNode head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }

        ListNode headTmp = head;
        ListNode headNext = headTmp.next;
        ListNode headNextNext = headTmp.next.next;
        ListNode tmp = null;

        // 先翻转第1、2个node
        tmp = headNext;
        headTmp.next = null;
        tmp.next = headTmp;

        headTmp = tmp;
        headNext = headNextNext;

        // 再循环反转剩下的
        while (headNext != null)
        {
            tmp = headNext.next;
            headNext.next = headTmp;
            headTmp = headNext;
            headNext = tmp;
        }

        return headTmp;
    }


    /**
     * 另一种类似的方式，可以节省点内存
     * @param head
     * @return
     */
    public ListNode reverseList01(ListNode head)
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
