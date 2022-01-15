package com.cts.udemy;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierEx {
    public static void main(String[] args) {
        Supplier<Date> sd = ()->new Date();
        System.out.println(sd.get());
        System.out.println(sd.get());
        System.out.println(sd.get());
    }
}
