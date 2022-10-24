package com.shf.demo.Sort;

public class RecursionDemo1 {
    public static void main(String[] args) {
        int i = FactiricalRecursion(5);
        System.out.println(i);
    }

    public static int FactiricalRecursion(int num) {
        if (num == 1) {
            return 1;
        }

        return num * FactiricalRecursion(num - 1);
    }
}
