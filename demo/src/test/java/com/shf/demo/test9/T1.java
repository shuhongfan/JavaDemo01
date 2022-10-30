package com.shf.demo.test9;

import java.util.Arrays;

public class T1 {
    public static void main(String[] args) {
        int[] a=new int[] {5,7,2,9,4,1,0,5,7};
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            int index = i;
            for (int j = index + 1; j < a.length; j++) {
                if (a[j] < a[index]) {
                    index = j;
                }
            }

            if (index != i) {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
