package com.Abstraction.ReportGenerator_Task;

abstract class ReportGenerator {

    String reportTitle;

    ReportGenerator(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    abstract void generateContent();

    void openFile() {
        System.out.println("Opening file.");
    }

    void writeContent() {
        System.out.println("Writing content to file.");
    }

    void saveFile() {
        System.out.println("Saving file.");
    }

    // Template Method
    final void generateReport() {
        openFile();
        generateContent();
        writeContent();
        saveFile();
    }
}