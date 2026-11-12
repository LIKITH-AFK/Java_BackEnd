package com.Collections;

import java.util.ArrayList;

class Course {

    private int courseId;
    private String courseName;
    private String duration;
    private double fee;

    public Course(int courseId, String courseName, String duration, double fee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}

public class CourseRegistration {
    public static void main(String[] args) {

        ArrayList<Course> availableCourses = new ArrayList<>();
        ArrayList<Course> enrolledCourses = new ArrayList<>();

        availableCourses.add(new Course(1, "Java", "3 Months", 10000));
        availableCourses.add(new Course(2, "Python", "2 Months", 9000));
        availableCourses.add(new Course(3, "SQL", "1 Month", 5000));
        availableCourses.add(new Course(4, "React", "2 Months", 12000));
        availableCourses.add(new Course(5, "AWS", "2 Months", 15000));

        enrolledCourses.add(availableCourses.get(1));
        enrolledCourses.add(availableCourses.get(3));

        availableCourses.addAll(enrolledCourses);

        System.out.println("Contains All: " + availableCourses.containsAll(enrolledCourses));

        availableCourses.remove(0);

        System.out.println("Available Courses");

        for (Course c : availableCourses) {
            System.out.println(c.getCourseId() + " "
                    + c.getCourseName() + " "
                    + c.getDuration() + " "
                    + c.getFee());
        }

        System.out.println("Total Courses: " + availableCourses.size());
    }
}