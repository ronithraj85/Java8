package com.cts.udemy;

public class EmployeeD {
    int eno;
    String ename;

    public EmployeeD(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "eno=" + eno +"- ename=" + ename;
    }
}
