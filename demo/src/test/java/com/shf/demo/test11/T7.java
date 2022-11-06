package com.shf.demo.test11;

public class T7 {
    private T7() {
        System.out.println("构造器私有");
    }

    private static T7 t7 = null;

    public static T7 getInstance() {
        if (t7 == null) {
            synchronized (T7.class) {
                if (t7 == null) {
                    t7 = new T7();
                }
            }
        }
        return t7;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                T7.getInstance();
            }).start();
        }
    }
}
