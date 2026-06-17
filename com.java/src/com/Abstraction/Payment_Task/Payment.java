package com.Abstraction.Payment_Task;

abstract class Payment {

    abstract void processPayment();

    abstract void validateTransaction();

    void generateTransactionId() {
        long id = (long)(Math.random() * 1000000000);
        System.out.println("Generated Transaction ID: " + id);
    }
}
