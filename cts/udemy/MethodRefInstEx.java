package com.cts.udemy;


interface Interfs{
    public void  m1();
}

public class MethodRefInstEx {
    public void m2(){
        System.out.println("Instance Method Reference ");
    }

    public static void main(String[] args) {
        MethodRefInstEx mx = new MethodRefInstEx();
        Interfs  it = mx::m2;
        it.m1();
    }
}
