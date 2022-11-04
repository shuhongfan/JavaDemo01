package com.shf.demo.test10;

import java.util.Arrays;

/**
 * 希尔排序
 */
public class T4 {
    public static void main(String[] args) {
        int[] a = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        System.out.println(Arrays.toString(a));
        shellSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void shellSort(int[] a) {
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < a.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (a[j] > a[j + gap]) {
                        int temp = a[j];
                        a[j] = a[j + gap];
                        a[j + gap] = temp;
                    }
                }
            }
        }
    }
}
