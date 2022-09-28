package com.shf.demo.test2;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class demo01 {
    @SneakyThrows
    public static void main(String[] args) {
        String s = new String("abc");

        Field value = s.getClass().getDeclaredField("value");
        value.setAccessible(true);
        value.set(s, "abcd".toCharArray());

        System.out.println(s);
    }
}
