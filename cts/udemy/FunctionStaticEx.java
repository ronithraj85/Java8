package com.cts.udemy;

import java.util.function.Function;

public class FunctionStaticEx {
    public static void main(String[] args) {
        Function<String, String> fi = Function.identity();
        System.out.println(fi.apply("Same as input"));
    }
}
