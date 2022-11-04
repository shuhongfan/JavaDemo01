package com.shf.demo.leecode;

import java.util.Arrays;

public class T88 {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] num2 = {2, 5, 6};
        int n = 3;

        merge2(num1,m,num2,n);
        System.out.println(Arrays.toString(num1));
    }

    public static void merge2(int[] num1,int m, int[] num2,int n) {
        int k = m + n;
        int[] temp = new int[k];
        for (int index = 0, nums1Index = 0, nums2Index = 0; index < k; index++) {
            if (nums1Index >= m) { //nums1数组已经取完，完全取nums2数组的值即可
                temp[index] = num2[nums2Index++];
            } else if (nums2Index >= n) {
                temp[index] = num1[nums1Index++];
            } else if (num1[nums1Index] < num2[nums2Index]) {
                temp[index] = num1[nums1Index++];
            } else {
                temp[index] = num2[nums2Index ++];
            }
        }

        for (int i = 0; i < k; i++) {
            num1[i] = temp[i];
        }
    }

    public static void merge(int[] num1,int m, int[] num2,int n) {
        for (int i = 0; i < n; i++) {
            num1[m + i] = num2[i];
        }
        Arrays.sort(num1);
    }
}
