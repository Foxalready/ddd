package com.example.demo.algr.linkedList;

import com.example.demo.model.ListNode;
import com.example.demo.utils.ListNodeUtil;

public class Problem147对链表进行插入排序 {

    public static void main(String[] args) {

        ListNode listNode = ListNodeUtil.genListNode(4, 1, 2, 3);
        ListNode listNode1 = insertionSortList(listNode);
        ListNodeUtil.printListNode(listNode1);


    }

    /**
     * md,跟之前的联系起来了，要交换链表的位置
     * 不会做，先背下来
     *
     * @param head
     * @return
     */
    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(head.val, head);
        ListNode pre = dummy, cur = head;
        while (cur != null) {
            if (pre.val <= cur.val) {
                pre = cur;
                cur = cur.next;
                continue;
            }
            ListNode p = dummy;
            while (p.next.val <= cur.val) {
                p = p.next;
            }
            ListNode t = cur.next;
            cur.next = p.next;
            p.next = cur;
            pre.next = t;
            cur = t;
        }
        return dummy.next;
    }

}
