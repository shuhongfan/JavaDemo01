package com.shf.demo.test4;

public class Solution4 {
    public static void main(String[] args) {
        boolean isTrue = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(isTrue);
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
//            从头和尾开始向中间遍历
            if (!Character.isLetterOrDigit(s.charAt(l))) { // 字符不是字母和数字的情况
                l++;
            } else if (!Character.isLetterOrDigit(s.charAt(r))) { // 字符不是字母和数字的情况
                r--;
            } else {
//                判断二者是否相等
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                    return false;
                }

                l++;
                r--;

            }
        }
        return true;
    }
}
