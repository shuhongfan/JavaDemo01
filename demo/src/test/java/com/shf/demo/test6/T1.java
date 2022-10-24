package com.shf.demo.test6;

public class T1 {
    public static volatile T1 instance = null;


    private T1() {
        System.out.println("构造方法执行了");
    }

    public static T1 getInstance() {
        if (instance == null) {
            synchronized (T1.class) {
                if (instance == null) {
                    instance = new T1();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                T1.getInstance();
            }).start();
        }
    }
}
