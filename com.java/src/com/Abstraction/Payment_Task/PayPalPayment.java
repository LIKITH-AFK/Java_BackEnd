package com.Abstraction.Payment_Task;

class PayPalPayment extends Payment {

    String email;
    String authToken;

    PayPalPayment(String email, String authToken) {
        this.email = email;
        this.authToken = authToken;
    }

    @Override
    void processPayment() {
        System.out.println("Processing PayPal payment.");
    }

    @Override
    void validateTransaction() {
        System.out.println("Validating email and authentication token.");
    }
}