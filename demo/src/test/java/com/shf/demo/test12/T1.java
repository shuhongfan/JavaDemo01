package com.shf.demo.test12;

import java.util.Arrays;

public class T1 {
    public static void main(String[] args) {
        int[] a=new int[] {5,7,2,9,4,1,0,5,7};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
