package com.shf.demo.test9;

import java.util.Arrays;

public class T3 {
    public static void main(String[] args) {
        int[] a=new int[] {5,7,2,9,4,1,0,5,7};
        System.out.println(Arrays.toString(a));
        quicksort(a,0,a.length-1);

        System.out.println(Arrays.toString(a));
    }

    public static void quicksort(int[] a, int l, int r) {
        int start = l;
        int end = r;

        if (start > end) {
            return;
        }

        int index = a[l];
        while (start != end) {
            while (true) {
                if (start >= end || index > a[end]) {
                    break;
                }
                end--;
            }

            while (true) {
                if (start >= end || index < a[start]) {
                    break;
                }
                start++;
            }

            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
        }

        int temp = a[l];
        a[l] = a[start];
        a[start] = temp;

        quicksort(a, l, start - 1);
        quicksort(a,start+1,r);
    }
}
