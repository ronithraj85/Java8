package com.cts.udemy;

import java.util.function.BiConsumer;

public class BiConsumerEx {
    public static void main(String[] args) {
        BiConsumer<String, String> bc = (s1, s2)-> System.out.println(s1+s2);
        bc.accept("durga", "soft");
    }
}
