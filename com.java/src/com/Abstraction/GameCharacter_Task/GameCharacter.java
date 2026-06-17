package com.Abstraction.GameCharacter_Task;

abstract class GameCharacter {

    String name;
    int level;
    int healthPoints;

    GameCharacter(String name, int level, int healthPoints) {
        this.name = name;
        this.level = level;
        this.healthPoints = healthPoints;
    }

    abstract void attack();

    void chooseTarget() {
        System.out.println("Target selected.");
    }

    void animateAttack() {
        System.out.println("Attack animation played.");
    }
}