package com.shf.demo.test6;

import java.util.Arrays;

/**
 * 冒泡排序  后面排好序
 *
 * 相邻的元素两两比较，小的放在前面，大的放在后面
 *
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 6, 9, 4, 8};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + i] = temp;
                }
            }
        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
