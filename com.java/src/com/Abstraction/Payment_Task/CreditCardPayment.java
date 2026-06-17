package com.Abstraction.Payment_Task;

class CreditCardPayment extends Payment {

    String cardNumber;
    String expiryDate;
    String cvv;

    CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    void processPayment() {
        System.out.println("Processing credit card payment.");
    }

    @Override
    void validateTransaction() {
        System.out.println("Validating card number, expiry, and CVV.");
    }
}
