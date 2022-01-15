package com.cts.udemy;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamForEach {
    public static void main(String[] args) {
        ArrayList<Integer> alfe = new ArrayList<>();
        alfe.add(10);
        alfe.add(12);
        alfe.add(2);
        alfe.stream().forEach(i-> System.out.println(i*2));
        System.out.println(alfe);
        Integer[] ialfe =  alfe.stream().toArray(Integer[]::new);
        System.out.println(alfe);

        Double[] d={10.0,10.1,10.2,10.3};
        Stream s1= Stream.of(d);
        s1.forEach(System.out :: print);
    }
}
