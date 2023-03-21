package com.example.demo.algr.linkedList;

import com.alibaba.fastjson.JSON;
import com.example.demo.model.ListNode;
import com.example.demo.utils.ListNodeUtil;

import java.util.Stack;

/**
 * 这个是不是就是传说中的翻转链表？
 * 翻转之后，再从头打印即可
 * 排序是错的，因为不需要进行排序，需要的是之前的老的顺序的倒序而已
 */
public class Problem6从尾到头打印链表 {


    public static void main(String[] args) {
        ListNode listNode = ListNodeUtil.genListNode(1, 2, 3, 5);
//        int[] result = reversePrintByReverseLinkedList(listNode);
//        int[] result = reversePrintByStack(listNode);
        int[] result = reversePrintByNum(listNode);
        System.out.println(JSON.toJSONString(result));
    }


    /**
     * 通过dummy节点来实现
     *
     * @param head
     * @return
     */
    public static int[] reversePrintByNum(ListNode head) {
        int n = 0;
        ListNode dummy = head;
        while (dummy != null) {
            n++;
            dummy = dummy.next;
        }

        int[] result = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            result[i] = head.val;
            head = head.next;
        }
        return result;
    }

    /**
     * 通过栈来实现
     *
     * @param head
     * @return
     */
    public static int[] reversePrintByStack(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        int n = 0;
        while (head != null) {
            stack.push(head.val);
            head = head.next;
            n++;
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = stack.pop();
        }
        return result;
    }


    /**
     * 通过翻转链表来实现
     *
     * @param head
     * @return
     */
    public static int[] reversePrintByReverseLinkedList(ListNode head) {
        ListNode pre = null;
        ListNode p = head;
        int n = 0;
        while (p != null) {
            ListNode q = p.next;
            p.next = pre;
            pre = p;
            p = q;
            n++;
        }
        ListNodeUtil.printListNode(pre);
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = pre.val;
            pre = pre.next;
        }
        return result;
    }
}
