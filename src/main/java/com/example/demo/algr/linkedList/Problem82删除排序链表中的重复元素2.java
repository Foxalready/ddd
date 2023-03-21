package com.example.demo.algr.linkedList;

import com.example.demo.model.ListNode;
import com.example.demo.utils.ListNodeUtil;

public class Problem82删除排序链表中的重复元素2 {

    public static void main(String[] args) {

        ListNode listNode = ListNodeUtil.genListNode(1, 2, 3, 3, 4, 4, 5);
        ListNode listNode1 = deleteDuplicates(listNode);
        ListNodeUtil.printListNode(listNode1);
    }


    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        ListNode curr = dummy;
        while (curr.next != null && curr.next.next != null) {
            if (curr.next.val == curr.next.next.val) {
                int val = curr.next.val;
                while (curr.next != null && curr.next.val == val) {
                    curr.next = curr.next.next;
                }
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }

}
