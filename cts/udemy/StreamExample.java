package com.cts.udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(1);
        al.add(0);
        al.add(23);
        al.add(24);
        al.add(2);
        al.add(72);
        al.add(15);
        al.add(200);
        System.out.println(al);
        List als = al.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(als);
        long lc = al.stream().filter(i->i%2==0).count();
        System.out.println(lc);
        System.out.println(al.stream().filter(i->i%2==0).min((a, b)->a.compareTo(b)).get());
        System.out.println(al.stream().filter(i->i%2==0).max((a, b)->a.compareTo(b)).get());
        System.out.println(al.stream().filter(i->i%2==0).sorted().collect(Collectors.toList()));
        System.out.println(al.stream().filter(i->i%2==0).sorted((a, b)->-a.compareTo(b)).collect(Collectors.toList()));
    }
}
