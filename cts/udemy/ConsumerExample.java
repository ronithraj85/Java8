package com.cts.udemy;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Integer> c = i->{
          i= i+i;
            System.out.println(i);
        };
        c.accept(15);
    }
}
