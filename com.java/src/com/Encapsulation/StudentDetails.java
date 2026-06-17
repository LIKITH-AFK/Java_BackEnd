package com.Encapsulation;

import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course Name : ");
        String course = sc.nextLine();

        System.out.print("Enter Initial Marks : ");
        double marks = sc.nextDouble();

        StudentResult obj = new StudentResult(name, id, course, marks);

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add More Subject Marks");
            System.out.println("2. Calculate Grade");
            System.out.println("3. View Total Marks");
            System.out.println("4. View Student Details");
            System.out.println("5. Exit");
            System.out.print("Enter Option : ");

            int option = sc.nextInt();

            switch (option) {

            case 1:
                System.out.print("Enter Subject Marks : ");
                double newMarks = sc.nextDouble();
                obj.addMarks(newMarks);
                break;

            case 2:
                obj.calculateGrade();
                break;

            case 3:
                System.out.println("Total Marks : " + obj.getTotalMarks());
                break;

            case 4:
                obj.displayStudentDetails();
                break;

            case 5:
                System.out.println("Thank You! Result Processing Completed.");
                sc.close();
                return;

            default:
                System.out.println("Invalid Option. Please Try Again.");
            }
        }
    }
}