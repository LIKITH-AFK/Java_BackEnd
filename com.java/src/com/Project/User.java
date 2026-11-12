package com.Project;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private int userId;
    private String username;
    private String password;
    private String contactNumber;

    public User(
            int userId,
            String username,
            String password,
            String contactNumber) {

        this.userId = userId;
        this.username = username;
        this.password = password;
        this.contactNumber = contactNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    @Override
    public String toString() {

        return "User ID: "
                + userId
                + " | Username: "
                + username
                + " | Contact: "
                + contactNumber;
    }
}