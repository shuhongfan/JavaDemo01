package com.shf.demo.test12;

public class T5 {
    private T5() {
        System.out.println("私有构造器");
    }

    private static T5 t5 = null;

    public static T5 getInstance() {
        if (t5 == null) {
            synchronized (T5.class) {
                if (t5 == null) {
                    t5 = new T5();
                }
            }
        }
        return t5;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                T5.getInstance();
            }).start();
        }
    }
}
