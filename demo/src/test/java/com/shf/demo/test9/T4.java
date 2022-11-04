package com.shf.demo.test9;

import java.util.concurrent.Exchanger;

public class T4 {

    private static final Exchanger<String> exchanger = new Exchanger<>();

    public static void main(String[] args) {
        new Thread(()->{

            try {
                String wares = "红烧肉";
                System.out.println(Thread.currentThread().getName() + "\t商品正在等待金前方，使用货物兑换金钱");
                Thread.sleep(200);

                String money = exchanger.exchange(wares);

                System.out.println(Thread.currentThread().getName() + "\t商品方使用商品兑换了" + money);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(()->{
            try {
                String money = "人民币";
                System.out.println(Thread.currentThread().getName()+"\t 金钱正在等待商品方，使用金钱购买食物");
                Thread.sleep(4000);
                String wares = exchanger.exchange(money);
                System.out.println(Thread.currentThread().getName() + "\t金前方使用金钱购买了" + wares);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }).start();
    }
}
