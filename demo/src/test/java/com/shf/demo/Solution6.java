package com.shf.demo;

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int cnt = 0, max = 0, i;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cnt++;
            } else {
                cnt--;
            }
            max = Math.max(max, cnt);
        }

        sc.close();
        System.out.println(max);
    }
}
