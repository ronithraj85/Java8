package com.cts.udemy;

import java.util.ArrayList;
import java.util.function.Function;

class Student{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class FunctionStudent {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        populateList(al);
        Function<Student,String> fst = student->{
            int marks=student.marks;
            if(marks>=80){
                return "Distinction";
            }
            else if (marks>=60){
                return "First Class";
            }
            else if(marks>=40){
                return "Second Class";
            }
            else {
                return  "Undefined";
            }
        };
        for(Student s:al){
            System.out.println("Name-"+s.name);
            System.out.println("Marks-"+s.marks);
            System.out.println("Grade-"+fst.apply(s));
        }
    }

    private static void populateList(ArrayList<Student> l){
        l.add(new Student("Sunny", 100));
        l.add(new Student("Bunny", 65));
        l.add(new Student("Chinny", 90));
        l.add(new Student("Pinny", 30));

    }
}
