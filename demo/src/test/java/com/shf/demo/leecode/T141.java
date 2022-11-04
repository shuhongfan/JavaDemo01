package com.shf.demo.leecode;

/**
 * 弗洛伊德算法  快慢指针
 */
public class T141 {
    public boolean hasCycle(ListNode head) {
        if (head==null) return false;
        ListNode slowPtr = head, fastPtr = head;
        while (fastPtr.next != null && fastPtr.next.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {
                return true;
            }
        }
        return false;
    }
}
