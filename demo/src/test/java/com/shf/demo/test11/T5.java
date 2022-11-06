package com.shf.demo.test11;

import java.util.Arrays;

/**
 * 快速排序
 */
public class T5 {
    public static void main(String[] args) {
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println(Arrays.toString(a));

        quickSort(a, 0, a.length - 1);

        System.out.println(Arrays.toString(a));
    }

    public static void quickSort(int[] a, int l, int r) {
        int start = l;
        int end = r;
        if (start > end) {
            return;
        }

        int num = a[l];
        while (start != end) {
            while (true) {
                if (start>=end||num>a[end]) break;
                end--;
            }
            while (true) {
                if (start>=end||num<a[start]) break;
                start++;
            }

            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
        }

        int temp = a[l];
        a[l] = a[start];
        a[start] = temp;

        quickSort(a, l, start - 1);
        quickSort(a, start + 1, r);
    }
}
