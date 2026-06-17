package com.Abstraction.GameCharacter_Task;

public class GameDemo {

    public static void main(String[] args) {

        GameCharacter warrior =
                new Warrior(
                        "Conan",
                        5,
                        100,
                        "Sword");

        GameCharacter mage =
                new Mage(
                        "Gandalf",
                        7,
                        120,
                        "Fireball");

        GameCharacter archer =
                new Archer(
                        "Legolas",
                        8,
                        110,
                        "Elven Arrow");

        warrior.attack();
        warrior.chooseTarget();
        warrior.animateAttack();

        System.out.println();

        mage.attack();
        mage.chooseTarget();
        mage.animateAttack();

        System.out.println();

        archer.attack();
        archer.chooseTarget();
        archer.animateAttack();
    }
}