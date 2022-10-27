package com.shf.demo.test7;

import java.util.Arrays;

public class T3 {
    public static void main(String[] args) {
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        int startIndex = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }

        for (int i = startIndex; i < a.length; i++) {
//            记录当前要插入的索引
            int j = i;
            while (j > 0 && a[j] < a[j - 1]) {
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
                j--;
            }
        }

        Arrays.stream(a).forEach(System.out::println);
    }
}
