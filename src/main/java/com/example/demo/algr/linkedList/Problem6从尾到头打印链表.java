package com.example.demo.algr.linkedList;

import com.alibaba.fastjson.JSON;
import com.example.demo.model.ListNode;
import com.example.demo.utils.LinkedListUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 这个是不是就是传说中的翻转链表？
 * 翻转之后，再从头打印即可
 * 排序是错的，因为不需要进行排序，需要的是之前的老的顺序的倒序而已
 */
public class Problem6从尾到头打印链表 {


    public static void main(String[] args) {
        ListNode listNode = LinkedListUtil.genListNode(1, 2, 3, 5);
        int[] result = reversePrint(listNode);
        System.out.println(JSON.toJSONString(result));
    }

    public static int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        list.stream().s
    }
}
