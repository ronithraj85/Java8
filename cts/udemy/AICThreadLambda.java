package com.cts.udemy;

public class AICThreadLambda {
    public static void main(String[] args) {
        Thread tl = new Thread(()->{
            for (int i = 0; i < 15; i++) {
                System.out.println("Child Thread");
            }
        });
        tl.start();
        for (int i = 0; i < 15; i++) {
            System.out.println("Main Thread");
        }
    }
}
