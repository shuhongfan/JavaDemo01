package com.shf.demo.test5;

public class Test1 {
    public static void main(String[] args) {
        int sum = getSum(12);
        System.out.println(sum);
    }

    public static int getSum(int month) {
        if (month == 1 || month == 2) {
            return 1;
        }
        return month + getSum(month - 1) + getSum(month - 2);
    }
}
