package com.shf.demo.test1;

import java.util.HashMap;
import java.util.Map;

public class LeetCode70 {
    Map<Integer, Integer> memo = new HashMap<Integer, Integer>();

    public int climbStairs(int n) {
        if (n < 3) {
            memo.put(n, n);
            return memo.get(n);
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        memo.put(n, climbStairs(n - 1) + climbStairs(n - 2));

        return memo.get(n);
    }

}
