package com.Abstraction.GameCharacter_Task;

class Warrior extends GameCharacter {

    String weaponType;

    Warrior(String name, int level,
            int healthPoints, String weaponType) {

        super(name, level, healthPoints);
        this.weaponType = weaponType;
    }

    @Override
    void attack() {
        System.out.println("Performing melee attack with "
                           + weaponType + ".");
    }
}
