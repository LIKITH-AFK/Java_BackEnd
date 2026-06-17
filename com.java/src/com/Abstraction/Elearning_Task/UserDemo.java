package com.Abstraction.Elearning_Task;

public class UserDemo {

    public static void main(String[] args) {

        User student = new Student(
                "student1",
                "student1@example.com",
                new String[]{"Math", "Science"},
                new int[]{90, 85});

        User instructor = new Instructor(
                "instructor1",
                "instructor1@example.com",
                new String[]{"Math 101"},
                new String[]{"Submission 1", "Submission 2"});

        User admin = new Admin(
                "admin1",
                "admin1@example.com",
                1000,
                50,
                new String[]{"Add User", "Remove User"});

        student.accessDashboard();
        student.login();
        student.updateProfile();
        student.logout();

        System.out.println();

        instructor.accessDashboard();
        instructor.login();
        instructor.updateProfile();
        instructor.logout();

        System.out.println();

        admin.accessDashboard();
        admin.login();
        admin.updateProfile();
        admin.logout();
    }
}