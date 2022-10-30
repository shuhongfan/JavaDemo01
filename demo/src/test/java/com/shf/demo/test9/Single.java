package com.shf.demo.test9;

public class Single {
    private Single() {
        System.out.println("nerw");
    }

    private static Single single = null;

    public static Single getSingle() {
        if (single == null) {
            synchronized (Single.class) {
                if (single == null) {
                    single = new Single();
                }
            }
        }
        return single;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Single.getSingle());
            }).start();
        }

    }
}
