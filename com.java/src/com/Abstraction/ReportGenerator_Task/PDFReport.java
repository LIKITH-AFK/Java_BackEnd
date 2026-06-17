package com.Abstraction.ReportGenerator_Task;

class PDFReport extends ReportGenerator {

    String blockText;

    PDFReport(String reportTitle, String blockText) {
        super(reportTitle);
        this.blockText = blockText;
    }

    @Override
    void openFile() {
        System.out.println("Opening PDF file.");
    }

    @Override
    void generateContent() {
        System.out.println("Generating PDF content with block text.");
    }

    @Override
    void writeContent() {
        System.out.println("Writing content to PDF file.");
    }

    @Override
    void saveFile() {
        System.out.println("Saving PDF file.");
    }
}
