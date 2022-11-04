package com.shf.demo.leecode;

public class D80 {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        if (n==1) return 1;
        if (n==2) return 2;
        int pre = 2;
        int prePre = 1;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = prePre + pre;
            prePre = pre;
            pre = result;
        }
        return result;
    }
}
