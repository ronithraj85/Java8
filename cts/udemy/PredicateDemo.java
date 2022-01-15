package com.cts.udemy;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        String[] names = {"Sunny", "Kajal", "Kopperla", "Katrina", "Kareena", "Mallika", "Jade"};
        Predicate<String> ps = (s)->s.charAt(0)=='K';
        checkForK(ps, names);
    }

    private static void checkForK(Predicate<String> ps, String[] names) {
        for(String s: names){
            if(ps.test(s)){
                System.out.println(s);
            }
        }
    }

}
