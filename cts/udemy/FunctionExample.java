package com.cts.udemy;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> f = s->s.length();
        System.out.println(f.apply("One"));
        System.out.println(f.apply("Three"));
    }
}
