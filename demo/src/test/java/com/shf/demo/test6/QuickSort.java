package com.shf.demo.test6;

import java.util.Arrays;

/**
 * 快速排序 递归
 *
 * 将排序范围中的第一个数字作为基准数，再定义两个变量start，end
 * start从前往后找比基准数大的，end从后往前找比基准数小的
 *
 * 找到之后交换start和end指向的元素，并循环这一过程，
 * 直到start和end存于同一个位置，该位置是基准数在数组中应存入的位置，再让基准数归位
 *
 * 归位后的效果：基准数左边的，比基准数小，基准数右边的，比基准数大
 *
 * 把0索引的数字作为基准数，确定基准数在数组中正确的位置。
 * 比基准数小的全部放在左边，比基准数大的全部在右边
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        quickSort(arr, 0, arr.length - 1);

        Arrays.stream(arr).forEach(System.out::println);
    }


    public static void quickSort(int[] arr,int i,int j) {
        int start = i;
        int end = j;

        if (start > end) {
            return; // 递归的出口
        }


        int baseNumber = arr[i]; //默认第一个数为基准数

//        利用循环找到要交换的数字
        while (start != end) {
//            利用end，从后往前找，找比基准数小的数字
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }

//            利用start，从前往后找，找比基准数大的数字
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }

//            把end和start指向的元素进行交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        /**
         * 当start和end指向同一个元素的时候，那么上面的循环就会结束
         * 表示已经找到基准数在数组中应存入的位置
         * 基准数就位
         * 就是拿着这个范围的第一个数字，跟start指向的元素进行交换
         */
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

//        确定6左边的范围，重复刚刚所做的事情
        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
    }
}
