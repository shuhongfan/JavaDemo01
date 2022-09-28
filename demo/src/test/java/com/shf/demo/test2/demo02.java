package com.shf.demo.test2;

public class demo02 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1==s2);//false


        String s3 = s1.intern();
        System.out.println(s2==s3);//true
    }
}
