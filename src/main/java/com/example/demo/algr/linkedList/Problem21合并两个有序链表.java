package com.example.demo.algr.linkedList;

import com.example.demo.model.ListNode;
import com.example.demo.utils.ListNodeUtil;

public class Problem21合并两个有序链表 {

    public static void main(String[] args) {
        ListNode listNode1 = ListNodeUtil.genListNode(1, 2, 4);
        ListNode listNode2 = ListNodeUtil.genListNode(1, 3, 4);
        ListNode result = mergeTwoLists(listNode1, listNode2);
        ListNodeUtil.printListNode(result);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(-1);
        ListNode current = result;
        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = list1 == null ? list2 : list1;
        return result.next;
    }

}
