package com.shf.demo.test10;

import java.util.Arrays;

public class T3 {
    public static void main(String[] args) {
        int[] a=new int[] {5,7,2,9,4,1,0,5,7};
        System.out.println(Arrays.toString(a));


        quickSort(a,0,a.length-1);

        System.out.println(Arrays.toString(a));
    }

    public static void quickSort(int[] a, int l, int r) {
        int left = l;
        int right = r;

        if (left>right) {
            return;
        }

        int indexNum = a[l];
        while (left != right) {
            while (true) {
                if (right <= left || indexNum > a[right]) {
                    break;
                }
                right--;
            }
            while (true) {
                if (right <= left || indexNum < a[left]) {
                    break;
                }
                left++;
            }

            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
        }

        int temp = a[l];
        a[l] = a[left];
        a[left] = temp;

        quickSort(a, l, left - 1);
        quickSort(a, left + 1, r);
    }
}
