package com.shf.demo.Sort;

import java.util.Arrays;

/**
 * 冒泡排序：相邻的元素两两比较，小的方前面，大的放后面
 * 选择排序：从0索引开始，拿着每一个索引上的元素跟后面的元素依次比较，小的放前面，大的放后面，以此类推
 * 插入排序：将数组分为有序和无序两组，遍历无序数据，将元素插入有序序列中即可
 * 快速排序：将排序范围中的第一个数字作为基准数，在定义两个变量start，end
 *      start从前往后找比基准数大的，end从后往前找比基准数小的
 *      找到之后交换start和end指向的元素，并循环这一过程，直到start和end处于同一位置，该位置是基准数在数组中应该存入的位置，再让基准数归位
 *
 *  归位后的效果：基准数左边的，比基准数小；基准数右边的，比基准数大
 */
public class QuickDemo {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(arr,0, arr.length-1);

        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;

        if (start > end) {
            return;
        }

        int baseNumber = arr[i];

        while (start != end) { // 利用end，从后往前找，找比基准数小的数字
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }

            while (true) { // 利用start，从前往后找，找比基准数大的数字
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        quickSort(arr, i, start - 1); // 左边范围
        quickSort(arr, start + 1, j); //右边范围
    }
}
