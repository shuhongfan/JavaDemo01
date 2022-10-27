package com.shf.demo.test7;

import java.util.Arrays;

public class T5 {
    public static void main(String[] args) {
        int[] a = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        sort(a, 0, a.length - 1);

        Arrays.stream(a).forEach(System.out::println);
    }

    public static void sort(int[] a, int start, int end) {
        if (start > end) {
            return;
        }

        int basicNum = a[start];

        while (start != end) {
            while (true) {
                if (end <= start && a[end] < basicNum) {
                    break;
                }
                end--;
            }

            while (true) {
                if (end <= start && a[start] > basicNum) {
                    break;
                }
                start++;
            }

            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
        }


    }
}
