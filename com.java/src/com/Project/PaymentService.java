package com.Project;

public class PaymentService {

    private InputHelper input;

    public PaymentService(
            InputHelper input) {

        this.input = input;
    }

    public boolean processPayment(
            double amount) {

        System.out.println(
                "\n========== PAYMENT =========="
        );

        System.out.println(
                "Amount Payable: ₹"
                + amount
        );

        System.out.println(
                "1. UPI"
        );

        System.out.println(
                "2. Card"
        );

        int choice =
                input.readInt(
                        "Select Payment Method: "
                );

        Payment payment;

        switch (choice) {

            case 1:

                payment =
                        new UPIPayment();

                break;

            case 2:

                payment =
                        new CardPayment();

                break;

            default:

                System.out.println(
                        "Invalid payment option."
                );

                return false;
        }

        payment.pay(amount);

        return true;
    }
}