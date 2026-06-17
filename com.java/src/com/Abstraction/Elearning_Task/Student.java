package com.Abstraction.Elearning_Task;

class Student extends User {

    String[] enrolledCourses;
    int[] grades;

    Student(String username, String email,
            String[] enrolledCourses, int[] grades) {

        super(username, email, "Student");
        this.enrolledCourses = enrolledCourses;
        this.grades = grades;
    }

    @Override
    void accessDashboard() {
        System.out.print("Accessing student dashboard: Enrolled Courses: ");

        for(String course : enrolledCourses) {
            System.out.print(course + " ");
        }

        System.out.print("; Grades: ");

        for(int grade : grades) {
            System.out.print(grade + " ");
        }

        System.out.println();
    }
}