        package com.synchronization;

        public class Synchronization {
        public static void main(String[] args) throws InterruptedException {
        SafeCounter c = new SafeCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count: " + c.count);
        }
      }
