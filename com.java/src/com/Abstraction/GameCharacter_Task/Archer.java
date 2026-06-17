package com.Abstraction.GameCharacter_Task;

class Archer extends GameCharacter {

    String arrowType;

    Archer(String name, int level,
           int healthPoints, String arrowType) {

        super(name, level, healthPoints);
        this.arrowType = arrowType;
    }

    @Override
    void attack() {
        System.out.println("Shooting arrow: "
                           + arrowType + ".");
    }
}