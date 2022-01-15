package com.cts.udemy;

import java.util.ArrayList;
import java.util.function.BiFunction;

class StudentB{
    int rno;
    String name;

    public StudentB(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }
}

public class BiFunctionEx {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> bf = (a,b)->a*b;
        System.out.println(bf.apply(10,2));
        System.out.println(bf.apply(12,3));
        BiFunction<Integer, String, StudentB> bfs = (no, name)->new StudentB(no, name);
        ArrayList<StudentB> ab = new ArrayList<>();
        ab.add(bfs.apply(1,"One"));
        ab.add(bfs.apply(2,"Two"));
        ab.add(bfs.apply(3,"Three"));
        for(StudentB sb: ab){
            System.out.println("Name-"+sb.name);
            System.out.println("RollNo-"+sb.rno);
        }
    }
}
