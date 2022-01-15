package com.cts.udemy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

class PredicateExample{
    public static void main(String[] args) {
//        Predicate<Integer> p = (in)->{
//            if(in>10){
//                return true;
//            }
//            else{
//                return false;
//            }
//        };
        //Above code can be replace by one line below.
        Predicate<Integer> pi = y -> y>1;
        System.out.println(pi.test(15));
        System.out.println(pi.test(5));
        Predicate<String> ps = si -> si.length() > 5;
        System.out.println(ps.test("ABCDEFGE"));
        System.out.println(ps.test("O"));
        Predicate<Collection> pc = c->!c.isEmpty();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        System.out.println(pc.test(al));
    }
}
