package com.shf.demo.test8;

import java.util.Arrays;

/**
 * 冒泡排序
 * 依次比较相邻的元素，若发现逆顺序，则交换。小的向前换，大的向后换，本次循环完毕之后再次从头开始扫描，
 * 直到某次扫描中没有元素交换，说明每个元素都不比它后面的元素大，至此排序完成。
 *
 *
 * 选择排序
 * 每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完。
 *
 *
 * 插入排序
 * 从第一个元素开始，该元素可以认为已经被排序
 * 取出下一个元素，在已经排序的元素序列中从后向前扫描
 * 如果该元素（已排序）大于新元素，将该元素移到下一位置
 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
 * 将新元素插入到该位置后
 * 重复上面步骤
 *
 *快速排序
 * 快速排序算法利用的是一趟快速排序,基本内容是选择一个数作为准基数,
 * 然后利用这个准基数将遗传数据分为两个部分,第一部分比这个准基数小,
 * 都放在准基数的左边,第二部分都比这个准基数大,放在准基数的右边.
 */
public class T1 {
    public static void main(String[] args) {
        int[] a=new int[] {5,7,2,9,4,1,0,5,7};

        System.out.println(Arrays.toString(a));
//        bubbleSort(a);
//        selectSort(a);
//        insertSort(a);
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    /**
     *快速排序
     * 将排序范围中第一个数字作为基准数，再定义两个变量start，end
     * start从前往后找比基准数大的，end从后往前找比基准数小的
     * 找到之后交换start和end指向的元素，并循环这一过程，直到start和end处于同一个位置，该位置是基准数在数组中应存入的位置，再让基准数归位
     * 归位后的效果：基准数左边的，比基准数小，基准数右边的，比基准数大
     * @param a
     * @param i
     * @param j
     */
    public static void quickSort(int[] a, int i, int j) {
        int start = i; // 定义两个变量记录要查找的
        int end = j;

        if (start > end) {
            return; // 递归出口
        }

        int baseNumber = a[i];  //记录基准数

        while (start != end) {
            while (true) { //利用end，从后往前找，比基准数小的数字
                if (end <= start || a[end] < baseNumber) {
                    break;
                }
                end--;
            }

            while (true) { //利用start，从前往后找，找比基准数大的数字
                if (end <= start || a[start] > baseNumber) {
                    break;
                }
                start++;
            }

//            把end和start指向的元素进行交换
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
        }

//        当start和end指向了同一个元素的时候，那么上面的循环就会结束
//        表示已经找到了基准数在数组中应存入的位置
//        基准数归位,就是呢这这个范围中的第一个数字，跟start指向的元素进行交换
        int temp = a[i];
        a[i] = a[start];
        a[start] = temp;

//        确定左边范围
        quickSort(a, i, start - 1);
        quickSort(a, start + 1, j);
    }

    /**
     * 插入排序
     * 从第一个元素开始，该元素可以认为已经被排序
     * 取出下一个元素，在已经排序的元素序列中从后向前扫描
     * 如果该元素（已排序）大于新元素，将该元素移到下一位置
     * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
     * 将新元素插入到该位置后
     * 重复上面步骤
     * @param a
     */
    public static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                int temp = a[i];
                int j;
                for (j = i - 1; j >= 0 && temp < a[j]; j--) {
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    /**
     * 选择排序
     * 每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完。
     * @param a
     */
    public static void selectSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = minIndex+1; j < a.length; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }

    /**
     * 冒泡排序
     * 依次比较相邻的元素，若发现逆顺序，则交换。小的向前换，大的向后换，本次循环完毕之后再次从头开始扫描，
     * 直到某次扫描中没有元素交换，说明每个元素都不比它后面的元素大，至此排序完成。
     * @param a
     */
    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
