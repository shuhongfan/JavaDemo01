package com.shf.demo.test8;


import java.util.Arrays;

/**
 * 插入
 */
public class T5 {
    public static void main(String[] args) {
        int[] a=new int[] {5,7,2,9,4,1,0,5,7};
        System.out.println(Arrays.toString(a));

        int startIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }

        for (int i = startIndex; i < a.length; i++) {
            int j = i;
            while (j > 0 && a[j] < a[j - 1]) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
