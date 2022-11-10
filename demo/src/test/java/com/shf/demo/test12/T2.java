package com.shf.demo.test12;

import java.util.Arrays;

public class T2 {
    public static void main(String[] args) {
        int[] a=new int[] {5,7,2,9,4,1,0,5,7};
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            int t = i;
            for (int j = t; j < a.length; j++) {
                if (a[j] < a[t]) {
                    t = j;
                }
            }

            int temp = a[t];
            a[t] = a[i];
            a[i] = temp;
        }

        System.out.println(Arrays.toString(a));
    }
}
