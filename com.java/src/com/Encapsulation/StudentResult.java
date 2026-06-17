package com.Encapsulation;

public class StudentResult {

    private String studentName;
    private int studentId;
    private String courseName;
    private double totalMarks;

    public StudentResult(String studentName, int studentId, String courseName, double totalMarks) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.courseName = courseName;
        this.totalMarks = totalMarks;
    }

    public void addMarks(double marks) {
        if (marks <= 0) {
            System.out.println("Invalid Marks");
        } else {
            totalMarks = marks;
            System.out.println("Marks Updated Successfully.");
        }
    }

    public void calculateGrade() {
        System.out.println("Total Marks : " + totalMarks);

        if (totalMarks >= 90) {
            System.out.println("Grade : A");
        } else if (totalMarks >= 80) {
            System.out.println("Grade : B");
        } else if (totalMarks >= 70) {
            System.out.println("Grade : C");
        } else if (totalMarks >= 60) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : Fail");
        }
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void displayStudentDetails() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Name       : " + studentName);
        System.out.println("ID         : " + studentId);
        System.out.println("Course     : " + courseName);
        System.out.println("TotalMarks : " + totalMarks);
    }
}