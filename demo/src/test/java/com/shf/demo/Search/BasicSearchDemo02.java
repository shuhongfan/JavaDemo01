package com.shf.demo.Search;

import java.util.ArrayList;
import java.util.List;

/**
 * 基本查找
 */
public class BasicSearchDemo02 {
    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 81, 79};
        int number = 81;

        List<Integer> list = basicSearch(arr, number);
        list.stream().forEach(System.out::println);
    }

    public static List<Integer> basicSearch(int[] arr, int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                list.add(i);
            }
        }
        return list;
    }
}
