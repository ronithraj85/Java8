package com.cts.udemy;

public class AICThreadDemo {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        for (int k=0;k<10;k++) {
            System.out.println("Parent Thread");
        }
    }
}
