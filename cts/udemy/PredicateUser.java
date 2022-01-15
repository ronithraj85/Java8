package com.cts.udemy;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
    String uname;
    String upassword;

    public User(String uname, String upassword) {
        this.uname = uname;
        this.upassword = upassword;
    }
}

public class PredicateUser {
    public static void main(String[] args) {
        Predicate<User> pu = (user)->user.uname.equals("Ron")&&user.upassword.equals("Ron123");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String us = sc.next();
        System.out.println("Enter password");
        String pd = sc.next();
        if(pu.test(new User(us,pd))){
            System.out.println("Welcome into Java8 world!");
        }
        else{
            System.out.println("Entered invalid credentials..");
        }
    }
}
