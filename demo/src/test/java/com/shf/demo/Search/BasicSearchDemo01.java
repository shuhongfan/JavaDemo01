package com.shf.demo.Search;

/**
 * 1. 七种查找方式
 * 基本查找
 * 二分查找
 * 插值查找
 * 斐波那契额查找
 *
 * 分块查找
 * 哈希查找
 *
 * 树表查找
 */
public class BasicSearchDemo01 {
    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int number = 82;
        System.out.println(basicSearch(arr, number));
    }

    public static boolean basicSearch(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
