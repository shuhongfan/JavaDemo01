package com.shf.demo.leecode;

public class T206 {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = preNode;
            preNode = curr;
            curr = next;
        }
        return preNode;
    }
}
