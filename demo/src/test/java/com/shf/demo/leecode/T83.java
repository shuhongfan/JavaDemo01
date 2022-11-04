package com.shf.demo.leecode;

public class T83 {
    public static void main(String[] args) {

    }

    // 递归处理，本质上其实就是将链表压站后倒序处理了
    public ListNode deleteDuplicates2(ListNode head) {
        if (head==null||head.next==null) return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode currentNode = head;
        while (null != currentNode.next) {
            if (currentNode.next.val == currentNode.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }


}
