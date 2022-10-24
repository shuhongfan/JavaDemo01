package com.shf.demo.test3;

public class Demo2 {
    public static volatile Demo2 singleton;

    private Demo2() {

    }

    public static Demo2 getInstance() {
        if (singleton == null) {
            synchronized (Demo2.class) {
                if (singleton == null) {
                    singleton = new Demo2();
                }
            }
        }
        return singleton;
    }
}
