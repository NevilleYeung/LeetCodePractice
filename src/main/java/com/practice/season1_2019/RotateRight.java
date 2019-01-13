package com.practice.season1_2019;

/**
 * 61. 旋转链表
 * https://leetcode-cn.com/problems/rotate-list/
 *
 */
public class RotateRight
{

    /*
    给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。

    示例 1:
    输入: 1->2->3->4->5->NULL, k = 2
    输出: 4->5->1->2->3->NULL
    解释:
    向右旋转 1 步: 5->1->2->3->4->NULL
    向右旋转 2 步: 4->5->1->2->3->NULL

    示例 2:
    输入: 0->1->2->NULL, k = 4
    输出: 2->0->1->NULL
    解释:
    向右旋转 1 步: 2->0->1->NULL
    向右旋转 2 步: 1->2->0->NULL
    向右旋转 3 步: 0->1->2->NULL
    向右旋转 4 步: 2->0->1->NULL
     */
    public ListNode rotateRight(ListNode head, int k)
    {
        if (head == null || head.next == null || k < 1)
        {
            return head;
        }

        ListNode headtmp = head;
        ListNode tail = null;
        ListNode pretail = null;

        int listLength = 1;
        // 找到list长度
        while (headtmp.next != null)
        {
            tail = headtmp.next;
            pretail = headtmp;
            headtmp = headtmp.next;
            listLength++;
        }

        // 移动次数为k对链表长度listLength的取模
        int num = k % listLength;
        for (; num > 0; num--)
        {
            headtmp = head;

            // 找到头尾节点
            while (headtmp.next != null)
            {
                tail = headtmp.next;
                pretail = headtmp;
                headtmp = headtmp.next;
                listLength++;
            }

            tail.next = head;
            pretail.next = null;
            head = tail;
        }

        return head;
    }
}
