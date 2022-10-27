package com.shf.demo.test7;

import java.util.Arrays;

public class T2 {
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 3, 1};

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        Arrays.stream(a).forEach(System.out::println);
    }
}
