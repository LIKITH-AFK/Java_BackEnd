package com.Abstraction.Payment_Task;

public class PaymentDemo {

    public static void main(String[] args) {

        Payment credit =
                new CreditCardPayment(
                        "1234567890123456",
                        "12/25",
                        "123");

        Payment upi =
                new UPIPayment(
                        "user@upi",
                        "1234567890");

        Payment paypal =
                new PayPalPayment(
                        "user@example.com",
                        "abc123");

        credit.processPayment();
        credit.validateTransaction();
        credit.generateTransactionId();

        System.out.println();

        upi.processPayment();
        upi.validateTransaction();
        upi.generateTransactionId();

        System.out.println();

        paypal.processPayment();
        paypal.validateTransaction();
        paypal.generateTransactionId();
    }
}