package com.shf.demo.leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T448 {
    public static void main(String[] args) {
        int[] num = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> res = findDisappearedNumbers(num);
        System.out.println(res);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        for (int num : nums) {
            int x = (num - 1) % n;
            nums[x] += n;
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
