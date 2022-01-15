package com.cts.udemy;

import java.util.function.Function;

public class FunctionSpacesExample {
    public static void main(String[] args) {
        Function<String, String> fs = s-> s.trim();
        System.out.println(fs.apply(" Test   "));
        Function<String, String> fsf = s-> s.replaceAll(" ",",");
        System.out.println(fsf.apply("One two three"));
    }
}
