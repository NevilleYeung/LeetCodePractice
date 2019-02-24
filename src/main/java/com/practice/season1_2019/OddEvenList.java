package com.practice.season1_2019;

import com.practice.common.ListNode;

/**
 * 328. 奇偶链表
 * https://leetcode-cn.com/problems/odd-even-linked-list/
 */
public class OddEvenList
{
    /*
    给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。

    请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。

    示例 1:
    输入: 1->2->3->4->5->NULL
    输出: 1->3->5->2->4->NULL

    示例 2:
    输入: 2->1->3->5->6->4->7->NULL
    输出: 2->3->6->7->1->5->4->NULL

    说明:
        应当保持奇数节点和偶数节点的相对顺序。
        链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。
     */
    public ListNode oddEvenList(ListNode head)
    {
        if (head == null || head.next == null || head.next.next == null)
        {
            return head;
        }

        // 奇数头
        ListNode oddHead = head;
        // 偶数头
        ListNode evenHead = head.next;
        ListNode odd = oddHead;
        ListNode even = evenHead;
        head = head.next.next;

        // 分别取出奇数和偶数链表
        while (head != null)
        {
            odd.next = head;
            odd = odd.next;

            if (head.next == null) break;
            even.next = head.next;

            head = head.next.next;


            even = even.next;
        }
        even.next = null;

        // 奇数尾连上偶数头
        odd.next = evenHead;

        return oddHead;
    }


    /**
     * 另一种更简洁的方法
     * @param head
     * @return
     */
    public ListNode oddEvenList01(ListNode head)
    {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode evenHead = head.next;
        ListNode even = evenHead;
        while (odd.next != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
