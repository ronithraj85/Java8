package com.cts.udemy;

import java.util.function.Predicate;

public class PredicateDemo1 {
    public static void main(String[] args) {
        String[] names={"Durga","",null,"Ravi","","Shiva",null};
        Predicate<String> ps = s ->s!=null && s.length()!=0  ;
        checkForEmNu(ps, names);
    }

    private static void checkForEmNu(Predicate<String> ps, String[] names) {
        for(String s:names){
            if(ps.test(s)){
                System.out.println(s);
            }
        }
    }
}
