package com.shf.demo;

public class Solution9 {
    public static void main(String[] args) {

    }

    public ListNode FindKthToTail(ListNode head, int k) {
//        如果链表为空或者k小于等于0
        if (head == null || k <= 0) {
            return null;
        }

//        生命两个指向头结点的节点
        ListNode node1 = head, node2 = head;

//        记录节点的个数
        int count = 0;

//        记录k值，后面要使用
        int index = k;

        while (node1 != null) {
            node1 = node1.next;
            count++;
            if (k < 1) {
                node2 = node2.next;
            }
            k--;
        }

//        如果节点个数小于所求的倒数第k个节点，则返回空
        if (count < index) {
            return null;
        }

        return node2;
    }
}
