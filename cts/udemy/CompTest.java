package com.cts.udemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 class MyComparator implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return  (a>b)?-1:(a<b)?1:0;
    }
 }
public class CompTest{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(1);
        al.add(11);
        al.add(0);
        al.add(14);
        System.out.println(al);
        Collections.sort(al, new MyComparator());
        System.out.println(al);
    }
}
