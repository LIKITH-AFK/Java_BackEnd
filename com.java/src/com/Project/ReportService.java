package com.Project;

import java.util.ArrayList;

public class ReportService {

    public void generateReport(
            ArrayList<User> users,
            ArrayList<Product> products,
            ArrayList<Order> orders) {

        double totalSales = 0;

        for (Order order :
                orders) {

            totalSales +=
                    order.getTotalAmount();
        }

        System.out.println(
                "\n===================================="
        );

        System.out.println(
                "          SALES REPORT"
        );

        System.out.println(
                "===================================="
        );

        System.out.println(
                "Total Users    : "
                + users.size()
        );

        System.out.println(
                "Total Products : "
                + products.size()
        );

        System.out.println(
                "Total Orders   : "
                + orders.size()
        );

        System.out.println(
                "Total Sales    : ₹"
                + totalSales
        );

        System.out.println(
                "===================================="
        );
    }
}