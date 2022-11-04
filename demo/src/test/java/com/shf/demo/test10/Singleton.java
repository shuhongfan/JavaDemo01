package com.shf.demo.test10;

public class Singleton {
    private Singleton() {
        System.out.println("构造函数");
    }

    private static Singleton singleton = null;

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                Singleton.getSingleton();
            }).start();
        }
    }
}
