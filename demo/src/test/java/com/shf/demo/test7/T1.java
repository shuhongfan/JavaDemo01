package com.shf.demo.test7;

import java.util.Arrays;

public class T1 {
    public static void main(String[] args) {
        int[] a = {3, 2, 6, 9, 4, 8};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        Arrays.stream(a).forEach(System.out::println);
    }
}
