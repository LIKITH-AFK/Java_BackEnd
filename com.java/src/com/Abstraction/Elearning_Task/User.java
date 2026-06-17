package com.Abstraction.Elearning_Task;

abstract class User {

    String username;
    String email;
    String role;

    User(String username, String email, String role) {
        this.username = username;
        this.email = email;
        this.role = role;
    }

    abstract void accessDashboard();

    void login() {
        System.out.println("Login successful.");
    }

    void logout() {
        System.out.println("Logout successful.");
    }

    void updateProfile() {
        System.out.println("Profile updated successfully.");
    }
}
