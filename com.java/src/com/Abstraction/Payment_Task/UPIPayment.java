package com.Abstraction.Payment_Task;

class UPIPayment extends Payment {

    String upiId;
    String phoneNumber;

    UPIPayment(String upiId, String phoneNumber) {
        this.upiId = upiId;
        this.phoneNumber = phoneNumber;
    }

    @Override
    void processPayment() {
        System.out.println("Processing UPI payment.");
    }

    @Override
    void validateTransaction() {
        System.out.println("Validating UPI ID and phone number.");
    }
}
