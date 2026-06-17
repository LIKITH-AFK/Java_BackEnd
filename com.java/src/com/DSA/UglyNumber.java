package com.DSA;

public class UglyNumber {
    public static void main(String[] args) {
        int num = 30;

        if (num <= 0) {
            System.out.println("Not an Ugly Number");
            return;
        }

        while (num % 2 == 0) {
            num /= 2;
        }

        while (num % 3 == 0) {
            num /= 3;
        }

        while (num % 5 == 0) {
            num /= 5;
        }

        if (num == 1) {
            System.out.println("Ugly Number");
        } else {
            System.out.println("Not an Ugly Number");
        }
    }
}
