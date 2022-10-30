package com.shf.demo.test8;

import java.util.Arrays;

public class T3 {
    public static void main(String[] args) {
        int[] a=new int[] {5,7,2,9,4,1,0,5,7};
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = a[minIndex];
                a[minIndex] = a[i];
                a[i] = temp;
            }
        }


        System.out.println(Arrays.toString(a));
    }
}
