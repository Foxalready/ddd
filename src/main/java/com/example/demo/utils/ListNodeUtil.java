package com.example.demo.utils;

import com.example.demo.model.ListNode;

public class ListNodeUtil {

    public static ListNode genListNode(Integer... value) {
        ListNode node = new ListNode(-1);
        ListNode current = node;
        for (Integer integer : value) {
            current.next = new ListNode(integer);
            current = current.next;
        }
        return node.next;
    }

    public static void printListNode(ListNode node) {
        if (node == null) {
            System.out.println("null");
        }
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.val).append("=>");
            node = node.next;
        }
        System.out.println(sb.append("null").toString());
    }

}
