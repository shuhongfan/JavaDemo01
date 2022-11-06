package com.shf.demo.test11;

import java.util.Arrays;

public class T2 {
    public static void main(String[] args) {
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            int index = i;
            for (int j = index; j < a.length; j++) {
                if (a[index] > a[j]) {
                    index = j;
                }
            }

            if (index != i) {
                int temp = a[index];
                a[index] = a[i];
                a[i] = temp;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
