package com.cts.udemy;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorLambda {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(1);
        al.add(20);
        al.add(0);
        al.add(14);
        System.out.println(al);
        Collections.sort(al, (I1, I2)->(I1>I2)?-1:(I1<I2)?1:0);
        System.out.println(al);
    }

}
