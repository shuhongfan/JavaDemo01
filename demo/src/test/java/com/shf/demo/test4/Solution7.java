package com.shf.demo.test4;

public class Solution7 {
    public static void main(String[] args) {
        String s = "-12312312";
        System.out.println("使⽤库函数转换：" + Integer.valueOf(s));
        int res = StrToInt(s);
        System.out.println("使⽤⾃⼰写的⽅法转换：" + res);
    }

    public static int StrToInt(String str) {
        if (str.length() == 0) {
            return 0;
        }

        char[] chars = str.toCharArray();

        int flag = 0;
        if (chars[0] == '+') {
            flag = 1;
        } else if (chars[0] == '-') {
            flag = 2;
        }

        int start = flag > 0 ? 1 : 0;
        int res = 0;

        for (int i = start; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                int temp = chars[i] - '0';
                res = res * 10 + temp;
            } else {
                return 0;
            }
        }
        return flag != 2 ? res : -res;
    }
}
