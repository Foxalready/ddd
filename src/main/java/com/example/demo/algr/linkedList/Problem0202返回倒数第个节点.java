package com.example.demo.algr.linkedList;

import com.example.demo.model.ListNode;
import com.example.demo.utils.ListNodeUtil;

public class Problem0202返回倒数第个节点 {

    public static void main(String[] args) {

        ListNode listNode = ListNodeUtil.genListNode(1, 2, 3, 4, 5);
        int i = kthToLast(listNode, 2);
        System.out.println(i);


    }

    public static int kthToLast(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }

}
