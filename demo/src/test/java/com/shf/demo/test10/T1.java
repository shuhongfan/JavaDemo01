package com.shf.demo.test10;

import java.util.Arrays;

public class T1 {
    public static void main(String[] args) {
        int[] a=new int[] {5,7,2,9,4,1,0,5,7};
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            int index = i;
            for (int j = index; j < a.length; j++) {
                if (a[index] > a[j]) {
                    index = j;
                }
            }

            if (index != i) {
                int temp = a[index];
                a[index] = a[i];
                a[i] = temp;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
