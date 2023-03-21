package com.example.demo.algr.linkedList;

import com.example.demo.model.ListNode;
import com.example.demo.utils.ListNodeUtil;

public class Problem83删除排序链表中的重复元素 {

    public static void main(String[] args) {
        ListNode listNode = ListNodeUtil.genListNode(1, 1, 2);
        ListNode listNode1 = deleteDuplicates(listNode);
        ListNodeUtil.printListNode(listNode1);
    }

    /**
     * 链表中，想把一个值删除掉，只需让 current.next = current.next.next
     *
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = head;
        while (dummy != null && dummy.next != null) {
            if (dummy.val == dummy.next.val) {
                dummy.next = dummy.next.next;
            } else {
                dummy = dummy.next;
            }
        }
        return head;
    }

}
