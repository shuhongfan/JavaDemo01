package com.shf.demo.Sort;

import java.util.Arrays;

/**
 * 选择排序  前面数据线有序
 */
public class SelectionDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 1};
        int temp;

        // i 表示这一轮中，我拿着那个索引上的数据跟后面的数据进行比较交换
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
//                拿着i和i后面的元素进行比较交换
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
