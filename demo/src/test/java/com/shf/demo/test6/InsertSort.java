package com.shf.demo.test6;

import java.util.Arrays;

/**
 * 插入排序
 *
 * 将数组分为有序和无序两组，遍历无序数据，将元素插入有序序列中即可
 *
 *  将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成无序的。
 *  遍历无序的数据，将遍历的元素插入有序序列中适当的位置，如遇到相同的数据，插在后面
 *  N的范围：0——最大索引
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        int startIndex = -1;

//        1. 找到无序的那一组数组是从哪个索引开始的
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }

//        2. 遍历从startIndex开始到最后一个元素，依次得到无序的那一组数据中的每一个元素
        for (int i = startIndex; i < arr.length; i++) {
//            记录当前要插入数据的索引
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
