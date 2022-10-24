package com.shf.demo.test3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class T3 {
    public volatile List list = new ArrayList();

    public void add(int i) {
        list.add(i);
    }

    public int gteSize() {
        return list.size();
    }

    public static void main(String[] args) {
        T3 t3 = new T3();
        CountDownLatch countDownLatch = new CountDownLatch(1);

        new Thread(()->{
            System.out.println("t2 start");
            if (t3.gteSize() != 5) {
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("T2 end");
            }
        },"t2").start();

        new Thread(()->{
            System.out.println("t1 start");
            for (int i = 0; i < 9; i++) {
                t3.add(i);
                System.out.println("add" + i);
                if (t3.gteSize() == 5) {
                    System.out.println("coundown is open");
                    countDownLatch.countDown();
                }
            }
            System.out.println("t1 end");
        },"t1").start();
    }
}
