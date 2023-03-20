package com.example.demo.concurrent;

public class DeadLockDemo {

    private static final String lock1 = "lock1";
    private static final String lock2 = "lock2";

    public static void main(String[] args) {
        DeadLockDemo deadLockDemo = new DeadLockDemo();

        Thread threadA = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("ThreadA get lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("ThreadA get lock2");
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("ThreadB get lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("ThreadB get lock1");
                }
            }
        });

        threadA.start();
        threadB.start();

        System.out.println("main end");

    }
}
