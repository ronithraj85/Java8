package com.cts.udemy;

import java.util.TreeSet;

public class TreeSetSorting {
    public static void main(String[] args) {
//        Default ascending sorting.
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(1);
        ts.add(11);
        ts.add(23);
        ts.add(4);
        ts.add(6);
        ts.add(10);
        System.out.println(ts);
//        With Lambda expression. - descending sorting.
        TreeSet<Integer> tsc = new TreeSet<>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
        tsc.add(10);
        tsc.add(1);
        tsc.add(11);
        tsc.add(23);
        tsc.add(4);
        tsc.add(6);
        System.out.println(tsc);
    }
}
