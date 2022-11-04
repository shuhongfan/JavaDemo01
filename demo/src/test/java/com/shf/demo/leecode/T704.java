package com.shf.demo.leecode;

public class T704 {
    public int search(int[] nums, int target) {
        return searchNums(nums, 0, nums.length - 1, target);
    }

    private int searchNums(int[] arr, int start, int end, int key) {
        int mid = (start + end) / 2;
        if (start <= end) {
            if (key > arr[mid]) {
                return searchNums(arr, mid + 1, end, key);
            } else if (key < arr[mid]) {
                return searchNums(arr, start, mid - 1, key);
            } else {
                return mid;
            }
        } else {
            return -1;
        }
    }
}
