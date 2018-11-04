package com.practice.Oct2018;

/**
 * 2. 两数相加
 * https://leetcode-cn.com/problems/add-two-numbers/description/
 *
 */
public class AddTwoNumbers
{
    /*
    给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
    你可以假设除了数字 0 之外，这两个数字都不会以零开头。

    示例：
    输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
    输出：7 -> 0 -> 8
    原因：342 + 465 = 807
     */

    /**
     * 以链表合并的思路实现，
     * 其实以新建链表的方式实现，代码更简洁
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        if (l1 == null)
        {
            if (l2 == null)
                return null;
            else
                return l2;
        }

        // 进位
        int addend = 0;
        ListNode l1Head = l1;
        ListNode l1Pre = null;

        // 循环l1，将l2的值加入到l1中
        while (l1 != null)
        {
            if (l2 != null)
            {
                l1.val = l1.val + l2.val + addend;
                addend = 0;

                if (l1.val > 9)
                {
                    addend++;
                    l1.val = l1.val % 10;
                }

                l2 = l2.next;
            }
            else
            {
                break;
            }

            l1Pre = l1;
            l1 = l1.next;
        }


        // l2比l1长的情况
        if (l2 != null)
        {
            // 将l2比l1长的部分添加到l1末尾
            // 并继续处理进位
            ListNode l2Pre = null;
            l1Pre.next = l2;

            // 处理进位
            if (addend != 0)
            {
                while (l2 != null)
                {
                    l2.val = l2.val + addend;
                    addend = 0;

                    if (l2.val > 9)
                    {
                        addend++;
                        l2.val = l2.val % 10;
                    }

                    if (addend == 0) break;

                    l2Pre = l2;
                    l2 = l2.next;
                }

                if (addend != 0)
                {
                    l2Pre.next = new ListNode(1);
                }
            }
        }
        // l1比l2长的情况
        else
        {
            // 在l1上继续处理进位
            if (addend != 0)
            {
                if (l1 == null)
                {
                    l1Pre.next = new ListNode(1);
                }
                else
                {
                    while (l1 != null)
                    {
                        l1.val = l1.val + addend;
                        addend = 0;

                        if (l1.val > 9)
                        {
                            addend++;
                            l1.val = l1.val % 10;
                        }

                        if (addend == 0) break;

                        l1Pre = l1;
                        l1 = l1.next;
                    }
                }

                if (addend != 0)
                {
                    l1Pre.next = new ListNode(1);
                }
            }
        }


        return l1Head;
    }
}
