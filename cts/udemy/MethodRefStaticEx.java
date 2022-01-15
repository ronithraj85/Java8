package com.cts.udemy;

interface InterfC{
    public void  m1();
}

public class MethodRefStaticEx {
    public static  void m2(){
        System.out.println("Method reference example");
    }
    public static void main(String[] args) {
        InterfC i = MethodRefStaticEx::m2;
        i.m1();
    }
}
