package com.shf.demo.test4;

import org.junit.platform.commons.util.StringUtils;

public class Solution {
    public static void main(String[] args) {
        String s1 = replaceSpace(new StringBuffer("We Are Happy."));
        System.out.println(s1);


        String s2 = replaceSpace2(new StringBuffer("We Are Happy."));
        System.out.println(s2);
    }

    public static String replaceSpace(StringBuffer stringBuffer) {
        int length = stringBuffer.length();

        StringBuffer res = new StringBuffer();
        for (int i = 0; i < length; i++) {
            char b = stringBuffer.charAt(i);
            if (String.valueOf(b).equals(" ")) {
                res.append("%20");
            } else {
                res.append(b);
            }
        }
        return res.toString();
    }

    public static String replaceSpace2(StringBuffer stringBuffer) {
        return stringBuffer.toString().replaceAll("\\s", "%20");
    }
}
