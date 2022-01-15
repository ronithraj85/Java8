package com.cts.udemy;

import java.util.ArrayList;
import java.util.Collections;

class CustomClassSorting {
    public static void main(String[] args) {
        ArrayList<EmployeeD> ae = new ArrayList<>();
        ae.add(new EmployeeD(100,"Ron"));
        ae.add(new EmployeeD(1,"Raj"));
        ae.add(new EmployeeD(300,"Shree"));
        ae.add(new EmployeeD(50,"Ree"));
        ae.add(new EmployeeD(600,"Rini"));
        System.out.println(ae);
        Collections.sort(ae, (a, b)->(a.eno>b.eno)?1:(a.eno<b.eno)?-1:0);
        System.out.println(ae);
        Collections.sort(ae, (a, b)->(a.eno>b.eno)?-1:(a.eno<b.eno)?1:0);
        System.out.println(ae);
    }
}
