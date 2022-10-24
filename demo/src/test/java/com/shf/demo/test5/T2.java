package com.shf.demo.test5;

public class T2 {
    public static void main(String[] args) {
        System.out.println(getCount(1));
    }

    public static int getCount(int day) {
        if (day <= 0 || day >= 11) {
            System.out.println("当前时间错误");
            return -1;
        }

        if (day == 10) {
            return 1;
        }

        return (getCount(day + 1) + 1) * 2;
    }
}
