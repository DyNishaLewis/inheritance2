package com.company;

public class Main {
    public static void main(String args[]) {
        Doctor john = new Doctor("john", "medical", 60000, 10);
        john.addmed(7);
        System.out.println(john);
        john.meds();
    }
}