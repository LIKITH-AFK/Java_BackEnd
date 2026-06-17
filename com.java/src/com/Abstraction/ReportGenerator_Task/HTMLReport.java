package com.Abstraction.ReportGenerator_Task;

class HTMLReport extends ReportGenerator {

    String markupContent;

    HTMLReport(String reportTitle, String markupContent) {
        super(reportTitle);
        this.markupContent = markupContent;
    }

    @Override
    void openFile() {
        System.out.println("Opening HTML file.");
    }

    @Override
    void generateContent() {
        System.out.println("Generating HTML content with markup.");
    }

    @Override
    void writeContent() {
        System.out.println("Writing content to HTML file.");
    }

    @Override
    void saveFile() {
        System.out.println("Saving HTML file.");
    }
}
