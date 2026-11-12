package com.Project;

import java.util.ArrayList;
import java.util.HashSet;

public class UserService {

    private ArrayList<User> users;

    private HashSet<String> usernames;

    private final String FILE_NAME =
            "users.dat";

    public UserService() {

        users = new ArrayList<>();

        usernames =
                new HashSet<>();

        loadUsers();
    }

    @SuppressWarnings("unchecked")
    private void loadUsers() {

        Object data =
                FileManager.readData(FILE_NAME);

        if (data != null) {

            users =
                    (ArrayList<User>) data;

            rebuildUsernameSet();
        }
    }

    private void rebuildUsernameSet() {

        usernames.clear();

        for (User user : users) {

            usernames.add(
                    user.getUsername()
            );
        }
    }

    private void saveUsers() {

        FileManager.saveData(
                FILE_NAME,
                users
        );
    }

    public void registerUser(User user) {

        if (user.getUserId() <= 0) {

            System.out.println(
                    "User ID must be positive."
            );

            return;
        }

        if (user.getUsername() == null
                ||
            user.getUsername()
                    .trim()
                    .isEmpty()) {

            System.out.println(
                    "Username cannot be empty."
            );

            return;
        }

        if (user.getPassword() == null
                ||
            user.getPassword()
                    .trim()
                    .isEmpty()) {

            System.out.println(
                    "Password cannot be empty."
            );

            return;
        }

        if (usernames.contains(
                user.getUsername())) {

            System.out.println(
                    "Username already exists."
            );

            return;
        }

        users.add(user);

        usernames.add(
                user.getUsername()
        );

        saveUsers();

        System.out.println(
                "User registered successfully."
        );
    }

    public User login(
            String username,
            String password) {

        for (User user : users) {

            if (user.getUsername()
                    .equals(username)
                    &&
                user.getPassword()
                    .equals(password)) {

                System.out.println(
                        "Login successful."
                );

                return user;
            }
        }

        System.out.println(
                "Invalid username or password."
        );

        return null;
    }

    public void viewUsers() {

        if (users.isEmpty()) {

            System.out.println(
                    "No registered users."
            );

            return;
        }

        System.out.println(
                "\n========== USERS =========="
        );

        for (User user : users) {

            System.out.println(user);
        }
    }

    public ArrayList<User>
            getUsers() {

        return users;
    }
}