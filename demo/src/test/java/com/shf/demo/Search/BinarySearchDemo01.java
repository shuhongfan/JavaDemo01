package com.shf.demo.Search;

/**
 * 二分查找： 数据必须是有序的
 * min和max表示当前查找的范围
 * mid是在min和max之间
 * 如果要查找的元素在mid左边，缩小范围时，min不变，max等于mid减1
 * 如果要查找的元素在mid右边，缩小范围时，max不变，min等于mid加1
 */
public class BinarySearchDemo01 {
    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 81, 79};
        int number = 81;

        int res = binarySearch(arr, number);
        System.out.println(res);
    }

    public static int binarySearch(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;

        while (true) {
            if (min > max) {
                return -1;
            }

            int mid = (max + min) / 2;

            if (arr[mid] > number) {
                max = mid - 1;
            } else if (arr[min] < number) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
    }
}
