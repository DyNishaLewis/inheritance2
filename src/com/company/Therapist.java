package com.company;

class Therapist extends Employee {
    int altmed = 0;

    public Therapist(String name, String degree, float salary, float yearsOfExperience) {
        super(name, degree, salary, yearsOfExperience);
    }

    public void stressball() {
        if (altmed <=0){
            System.out.println("I ran out of stress balls!");
        } else {
            altmed--;
            System.out.println("Take this stress ball.");
        }
    }
    public void addaltmed (int altmed){ this.altmed += altmed; }
}

