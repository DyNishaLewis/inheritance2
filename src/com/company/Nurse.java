package com.company;

class Nurse extends Employee {
    int medtools = 0;

    public Nurse(String name, String degree, float salary, float yearsOfExperience) {
        super(name, degree, salary, yearsOfExperience);
    }

    public void tool () {
        if (medtools <= 0) {
            System.out.println("I need more medtools");
        } else {
            medtools--;
            System.out.println("I was able to do the treatment");

        }

    }
    public void addmedtools (int medtools) {
        this.medtools += medtools;
    }
}
