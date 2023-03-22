package com.example.demo.algr.linkedList;

import com.example.demo.model.ListNode;
import com.example.demo.utils.ListNodeUtil;

public class Problem23合并k个有序链表 {

    public static void main(String[] args) {
        ListNode listNode = ListNodeUtil.genListNode(1, 4, 5);
        ListNode listNode1 = ListNodeUtil.genListNode(1, 3, 4);
        ListNode listNode2 = ListNodeUtil.genListNode(2, 6);
        ListNode[] lists = new ListNode[]{listNode, listNode1, listNode2};
        ListNode listNode3 = mergeKLists(lists);
        ListNodeUtil.printListNode(listNode3);
    }

//    public static ListNode mergeKLists(ListNode[] lists) {
//        if (lists == null || lists.length == 0) {
//            return null;
//        }
//        ListNode result = null;
//        for (int i = 0; i < lists.length; i++) {
//            result = mergeTwoLists(result, lists[i]);
//        }
//        return result;
//    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return merge(lists, 0, lists.length - 1);
    }


    public static ListNode merge(ListNode[] lists, int l, int r) {
        if (l == r) {
            return lists[l];
        }
        if (l > r) {
            return null;
        }
        int mid = l + r >> 1;
        return mergeTwoLists(merge(lists, l, mid), merge(lists, mid + 1, r));
    }


//    public static ListNode mergeKLists(ListNode[] lists) {
//        if (lists == null || lists.length == 0) {
//            return null;
//        }
//        int length = lists.length;
//        for (int i = 1; i < length; i++) {
//            lists[i] = mergeTwoLists(lists[i], lists[i - 1]);
//        }
//        return lists[length - 1];
//    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode tmp = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tmp.next = list1;
                list1 = list1.next;
            } else {
                tmp.next = list2;
                list2 = list2.next;
            }
            tmp = tmp.next;
        }
        tmp.next = list1 == null ? list2 : list1;
        return dummy.next;
    }
}
