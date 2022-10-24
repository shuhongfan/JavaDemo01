package com.shf.demo.Sort;

import java.util.Arrays;

/**、
 * 插入排序
 *
 * 有序
 * 无序
 */
public class InsertDemo {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        int startIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1; // 无序开始索引
                break;
            }
        }

        for (int i = startIndex; i < arr.length; i++) {
            int j = i; // 记录当前插入数据的索引
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
