package com.shf.demo.test6;

import java.util.Arrays;

/**
 * 选择排序
 * 从0索引开始，拿着每一个索引上的元素跟着后面的元素依次比较，
 * 小的放前面，大的放后面，以此类推
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 1};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
