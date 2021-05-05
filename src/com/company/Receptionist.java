package com.company;

class Receptionist extends Employee {
    int paper = 0;

    public Receptionist(String name, String degree, float salary, float yearsOfExperience) {
        super(name, degree, salary, yearsOfExperience);
    }

    public void papers() {
        if (paper <= 0) {
            System.out.println("I need more paper soon.");
        } else {
            paper--;
            System.out.println("Time to get some work done!");
        }
    }
    public void addpaper (int paper){ this.paper += paper; }
}
