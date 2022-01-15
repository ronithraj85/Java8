package com.cts.udemy;

import java.util.function.Function;

public class FunctionChainExample {
    public static void main(String[] args) {
        Function<String, String> fs = s->s.toUpperCase();
        Function<String, String> fs1 = s->s.substring(0,9);
        System.out.println(fs.apply("Aishwaryaabhishek"));
        System.out.println(fs1.apply("Aishwaryaabhishek"));
        System.out.println(fs.andThen(fs1).apply("Aishwaryaabhishek"));
        System.out.println(fs.andThen(fs1).apply("Aishwaryaabhishek"));
    }
}
