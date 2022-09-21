package com.shf.demo;

import java.util.HashSet;

public class Solution3 {
    public static void main(String[] args) {
        int res = longestPalindrome("abccccdd");
        System.out.println(res);
    }

    public static int longestPalindrome(String s) {
        if (s.length() == 0) {
            return 0;
        }

        HashSet<Character> hashSet = new HashSet<>();
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (!hashSet.contains(chars[i])) { // 如果hashset没有该字符串就保存
                hashSet.add(chars[i]);
            } else { // 如果有，就让count++（说明找到一个成对的字符串
                hashSet.remove(chars[i]);
                count++;
            }
        }
        return hashSet.isEmpty() ? count * 2 : count * 2 + 1;
    }
}
