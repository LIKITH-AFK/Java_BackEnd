package com.Abstraction.GameCharacter_Task;

class Mage extends GameCharacter {

    String spellType;

    Mage(String name, int level,
         int healthPoints, String spellType) {

        super(name, level, healthPoints);
        this.spellType = spellType;
    }

    @Override
    void attack() {
        System.out.println("Casting spell: "
                           + spellType + ".");
    }
}
