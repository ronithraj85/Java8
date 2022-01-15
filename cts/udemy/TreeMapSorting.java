package com.cts.udemy;

import java.util.TreeMap;

public class TreeMapSorting {
    public static void main(String[] args) {
//        Default ascending sorting
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(10, "One");
        tm.put(100, "Four");
        tm.put(20, "One");
        tm.put(3, "Three");
        tm.put(450, "Two");
        System.out.println(tm.keySet());
        System.out.println(tm);
        TreeMap<Integer, String> tmc = new TreeMap<>((a,b)->(a>b)?-1:(a<b)?1:0);
        tmc.put(10, "One");
        tmc.put(100, "Four");
        tmc.put(20, "One");
        tmc.put(3, "Three");
        tmc.put(450, "Two");
        System.out.println(tmc);
    }
}
