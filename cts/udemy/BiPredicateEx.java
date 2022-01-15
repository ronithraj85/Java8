package com.cts.udemy;

import java.util.function.BiPredicate;

public class BiPredicateEx {
    public static void main(String[] args) {
//        Even number check
        BiPredicate<Integer, Integer> bi = (a,b)->(a+b)%2==0;
        System.out.println(bi.test(1,4));
        System.out.println(bi.test(1,3));
    }
}
