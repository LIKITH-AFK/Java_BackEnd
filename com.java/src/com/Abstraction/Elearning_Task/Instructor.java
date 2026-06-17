package com.Abstraction.Elearning_Task;

class Instructor extends User {

    String[] createdCourses;
    String[] studentSubmissions;

    Instructor(String username, String email,
               String[] createdCourses,
               String[] studentSubmissions) {

        super(username, email, "Instructor");
        this.createdCourses = createdCourses;
        this.studentSubmissions = studentSubmissions;
    }

    @Override
    void accessDashboard() {

        System.out.print("Accessing instructor dashboard: Created Courses: ");

        for(String course : createdCourses) {
            System.out.print(course + " ");
        }

        System.out.print("; Student Submissions: ");

        for(String submission : studentSubmissions) {
            System.out.print(submission + " ");
        }

        System.out.println();
    }
}