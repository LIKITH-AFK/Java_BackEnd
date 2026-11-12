package com.Project;

public class Admin extends User {

    private String role;

    public Admin(int userId, String username,
                 String password,
                 String contactNumber,
                 String role) {

        super(userId, username, password, contactNumber);

        this.role = role;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {

        return "Admin ID: " + getUserId()
                + " | Username: " + getUsername()
                + " | Role: " + role;
    }
}