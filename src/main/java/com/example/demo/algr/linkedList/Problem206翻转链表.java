package com.example.demo.algr.linkedList;

import com.example.demo.model.ListNode;
import com.example.demo.utils.ListNodeUtil;

/**
 * https://leetcode.cn/problems/reverse-linked-list/
 */
public class Problem206翻转链表 {

    public static void main(String[] args) {
        ListNode listNode = ListNodeUtil.genListNode(1, 2, 3, 4, 5);
        ListNodeUtil.printListNode(listNode);
        ListNode listNode1 = reverseList(listNode);
        ListNodeUtil.printListNode(listNode1);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode tmp = head;
        while (tmp != null) {
            ListNode next = tmp.next;
            tmp.next = pre;
            pre = tmp;
            tmp = next;
        }
        return pre;
    }

}
