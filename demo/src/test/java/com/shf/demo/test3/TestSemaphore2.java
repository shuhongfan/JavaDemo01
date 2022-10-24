package com.shf.demo.test3;

import java.util.concurrent.Semaphore;

public class TestSemaphore2 {
    public static void main(String[] args) {
        int permitsNum = 2;

        final Semaphore semaphore = new Semaphore(permitsNum);

        try {
            System.out.println(semaphore.availablePermits());
            semaphore.release();
            System.out.println(semaphore.availablePermits());
        } catch (Exception e) {

        }
    }
}
