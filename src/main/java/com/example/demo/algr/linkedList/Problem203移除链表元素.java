package com.example.demo.algr.linkedList;

import com.example.demo.model.ListNode;
import com.example.demo.utils.ListNodeUtil;

public class Problem203移除链表元素 {


    public static void main(String[] args) {
        ListNode listNode = ListNodeUtil.genListNode(1, 2, 6, 3, 4, 5, 6);
        ListNode listNode1 = removeElements(listNode, 6);
        ListNodeUtil.printListNode(listNode1);
    }


    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1, head);
        ListNode curr = dummy;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }

}
