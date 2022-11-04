package com.shf.demo.leecode;

public class T22 {
    public static ListNode kthNodeFromEnd(ListNode head, int kthNode) {
        if (kthNode<=0||head==null) return null;
        ListNode pTemp = head, pKthNode = null;
        for (int count = 1; count < kthNode; count++) {
            if (pTemp != null) {
                pTemp = pTemp.next;
            }
        }

        while (pTemp != null) {
            if (pTemp == null) {
                pKthNode = head;
            } else {
                pKthNode = pKthNode.next;
            }
            pTemp = pTemp.next;
        }

        if (pKthNode != null) {
            return pKthNode;
        }

        return null;
    }
}
