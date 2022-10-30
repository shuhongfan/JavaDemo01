package com.shf.demo.test8;

import java.util.Arrays;

public class T9 {
    public static void main(String[] args) {
        int[] a=new int[] {5,7,2,9,4,1,0,5,7};
        System.out.println(Arrays.toString(a));
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void quickSort(int[] a, int i, int j) {
        int start = i;
        int end = j;

        if (start > end) {
            return;
        }

        int baseNum = a[i];

        while (start != end) {
            while (true) {
                if (end <= start && baseNum > a[end]) {
                    break;
                }
                end--;
            }

            while (true) {
                if (end <= start && baseNum > a[start]) {
                    break;
                }
                start++;
            }

            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
        }

        int temp = a[i];
        a[i] = a[start];
        a[start] = temp;

        quickSort(a, i, start - 1);
        quickSort(a, start + 1, j);
    }
}
