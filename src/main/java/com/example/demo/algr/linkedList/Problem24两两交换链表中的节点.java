package com.example.demo.algr.linkedList;

import com.example.demo.model.ListNode;
import com.example.demo.utils.ListNodeUtil;

/**
 * https://leetcode.cn/problems/swap-nodes-in-pairs/
 */
public class Problem24两两交换链表中的节点 {

    public static void main(String[] args) {
        ListNode listNode = ListNodeUtil.genListNode(1, 2, 3, 4);
        ListNode listNode1 = swapPairs(listNode);
        ListNodeUtil.printListNode(listNode1);
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(-1, head);
        ListNode tmp = pre;
        while (tmp.next != null && tmp.next.next != null) {
            ListNode start = tmp.next;
            ListNode end = tmp.next.next;
            tmp.next = end;
            start.next = end.next;
            end.next = start;
            tmp = start;
        }
        return pre.next;
    }

}
