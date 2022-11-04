package com.shf.demo.leecode;

public class T142 {
    public ListNode detectCycle(ListNode head) {
        if (head==null) return null;
        ListNode slowPtr = head, fastPtr = head;
        boolean loopExists = false;

        while (fastPtr.next != null && fastPtr.next.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {
                loopExists = true;
                break;
            }
        }

        if (loopExists) {
            slowPtr = head;
            while (slowPtr != fastPtr) {
                fastPtr = fastPtr.next;
                slowPtr = slowPtr.next;
            }
            return slowPtr;
        }
        return null;
    }
}
