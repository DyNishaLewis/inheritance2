package com.company;

public class Doctor extends Employee {
    int med = 0;

    public Doctor(String name, String degree, float salary, float yearsOfExperience) {
        super(name, degree, salary, yearsOfExperience);
    }

    public void meds() {
        if (med <= 0) {
            System.out.println("I cannot give you any meds.");
        } else {
            med--;
            System.out.println("Take those pills!");
        }

    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                '}';
    }

    public void addmed (int med){ this.med += med; }
}
