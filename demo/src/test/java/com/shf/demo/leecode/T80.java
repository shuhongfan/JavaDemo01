package com.shf.demo.leecode;

import java.util.HashMap;
import java.util.Map;

public class T80 {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
        System.out.println(climbStairs2(5));
        System.out.println(climbStairs3(5));
    }

    /**
     * 循环的解法，自底向上
     * @param n
     * @return
     */
    public static int climbStairs3(int n) {
        if (n==1) return 1;
        if (n==2) return 2;
        int result = 0;
        int pre = 2;
        int prePre = 1;
        for (int i = 3; i <= n; i++) {
            result = pre + prePre;
            prePre = pre;
            pre = result;
        }
        return result;
    }

    private static Map<Integer, Integer> storeMap = new HashMap<Integer, Integer>();
    public static int climbStairs2(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (null != storeMap.get(n)) {
            return storeMap.get(n);
        } else {
            int result = climbStairs2(n - 1) + climbStairs2(n - 2);
            storeMap.put(n, result);
            return result;
        }
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
