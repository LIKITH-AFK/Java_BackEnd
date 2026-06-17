package com.Abstraction.ReportGenerator_Task;

class ExcelReport extends ReportGenerator {

    String[][] tabularData;

    ExcelReport(String reportTitle, String[][] tabularData) {
        super(reportTitle);
        this.tabularData = tabularData;
    }

    @Override
    void openFile() {
        System.out.println("Opening Excel file.");
    }

    @Override
    void generateContent() {
        System.out.println("Generating Excel content with tabular data.");
    }

    @Override
    void writeContent() {
        System.out.println("Writing content to Excel file.");
    }

    @Override
    void saveFile() {
        System.out.println("Saving Excel file.");
    }
}