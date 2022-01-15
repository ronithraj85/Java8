package com.cts.udemy;

interface Interf{
    public Sample get();
}
class Sample{
    Sample(){
        System.out.println("Sample Construction");
    }
}

public class ConstructorRefEx {
    public static void main(String[] args) {
        Interf itf = Sample::new;
        Sample s = itf.get();
    }
}
