package com.company;

class Janitor extends Employee {
    int supplies = 0;

    public Janitor(String name, String degree, float salary, float yearsOfExperience) {
        super(name, degree, salary, yearsOfExperience);
    }

    public void clean() {
        if (supplies <= 0) {
            System.out.println("Cannot clean, no supplies");
        } else {
            supplies--;
            System.out.println("Successfully cleaned");
        }
    }

    public void addSupplies(int supplies) {
        this.supplies += supplies;
    }
}