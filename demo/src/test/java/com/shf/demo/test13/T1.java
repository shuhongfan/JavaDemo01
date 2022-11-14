package com.shf.demo.test13;

public class T1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;


    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
