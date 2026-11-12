package com.Project;

public class CardPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
                "Payment of ₹" + amount
                + " completed using Card."
        );
    }
}