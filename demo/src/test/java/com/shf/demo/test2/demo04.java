package com.shf.demo.test2;

public class demo04 {
    public static void main(String[] args) {
        String s = new String("1");
        String t = new String("1");
        String x = new String("1") + new String("1");
        String s1 = s.intern();
        String s2 = "1";
        String s3 = "11";

        System.out.println(s == s1); // f
        System.out.println(s1 == s2); // t
        System.out.println(s == t); // f
        System.out.println(s.intern() == t.intern()); // t
        System.out.println(x == s3);  // f
        System.out.println(x.intern() == s3.intern()); //t
    }
}
