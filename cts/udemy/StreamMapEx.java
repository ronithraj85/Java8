package com.cts.udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapEx {
    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<>();
        ls.add("one");
        ls.add("two");
        ls.add("three");
        ls.add("four");
        System.out.println(ls);
        List<String> lsm = ls.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(lsm);
    }
}
