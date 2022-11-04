package com.shf.demo.leecode;

import java.util.Arrays;
import java.util.HashMap;

public class T1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] result = twoSum2(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> storeNums = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            Integer anotherIndex = storeNums.get(another);
            if (null != anotherIndex) {
                result[0] = anotherIndex;
                result[1] = i;
                break;
            } else {
                storeNums.put(nums[i], i);
            }
        }
        return result;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
