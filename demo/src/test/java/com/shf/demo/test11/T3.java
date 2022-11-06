package com.shf.demo.test11;

import java.util.Arrays;

/**
 * 插入排序
 */
public class T3 {
    public static void main(String[] args) {
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        System.out.println(Arrays.toString(a));

        int startIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }

        for (int i = startIndex; i < a.length; i++) {
            int j = i;
            while (j > 0 && a[j] < a[j - 1]) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
