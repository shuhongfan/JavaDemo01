package com.shf.demo.test7;

import java.util.Arrays;

public class T4 {
    public static void main(String[] args) {
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        int startIndex = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[i + 1]) {
                startIndex = startIndex + 1;
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
        Arrays.stream(a).forEach(System.out::println);
    }
}
