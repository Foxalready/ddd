package com.example.demo.algr.linkedList;


import com.example.demo.model.ListNode;

public class Problem237删除链表中的节点 {


    public static void main(String[] args) {

    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
