package com.shf.demo.test1;

import java.util.HashMap;

public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> memo = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if (memo.containsKey(val)) {
                return new int[]{i, memo.get(val)};
            } else {
                memo.put(nums[i], i);
            }
        }
        return new int[2];
    }
}
