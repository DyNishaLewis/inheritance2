package com.company;

class Administrator extends Employee {
    int keycard = 0;

    public Administrator(String name, String degree, float salary, float yearsOfExperience) {
        super(name, degree, salary, yearsOfExperience);
    }

    public void tool() {
        if (keycard <= 0) {
            System.out.println(" I need more keycards soon");
        } else {
            keycard--;
            System.out.println("Given you a keycard");
        }
    }

    public void addkeycard(int keycard) {
        this.keycard += keycard;
    }
}