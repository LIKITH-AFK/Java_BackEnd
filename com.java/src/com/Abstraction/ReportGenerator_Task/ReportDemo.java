package com.Abstraction.ReportGenerator_Task;

public class ReportDemo {

    public static void main(String[] args) {

        ReportGenerator pdf =
                new PDFReport(
                        "Sample Report",
                        "This is a sample block text.");

        ReportGenerator excel =
                new ExcelReport(
                        "Sample Report",
                        new String[][]{
                                {"Name", "Age"},
                                {"John", "30"},
                                {"Jane", "25"}
                        });

        ReportGenerator html =
                new HTMLReport(
                        "Sample Report",
                        "<h1>Sample Report</h1>");

        pdf.generateReport();

        System.out.println();

        excel.generateReport();

        System.out.println();

        html.generateReport();
    }
}
