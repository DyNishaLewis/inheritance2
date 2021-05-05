package com.company;

class Surgeon extends Employee {
    int scalpel = 0;

    public Surgeon(String name, String degree, float salary, float yearsOfExperience) {
        super(name, degree, salary, yearsOfExperience);
    }

    public void tools() {
        if (scalpel <= 0) {
            System.out.println("I need more scalpels soon.");
        } else {
            scalpel--;
            System.out.println("Time to start slicing and dicing");
        }
    }
    public void addscalpel (int scalpel){ this.scalpel += scalpel;}
}
