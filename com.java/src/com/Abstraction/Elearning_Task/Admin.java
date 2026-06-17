package com.Abstraction.Elearning_Task;

class Admin extends User {

    int visitors;
    int courses;
    String[] userManagementTools;

    Admin(String username, String email,
          int visitors, int courses,
          String[] userManagementTools) {

        super(username, email, "Admin");
        this.visitors = visitors;
        this.courses = courses;
        this.userManagementTools = userManagementTools;
    }

    @Override
    void accessDashboard() {

        System.out.print("Accessing admin dashboard: ");
        System.out.print("Visitors: " + visitors);
        System.out.print(", Courses: " + courses);

        System.out.print("; User Management Tools: ");

        for(String tool : userManagementTools) {
            System.out.print(tool + " ");
        }

        System.out.println();
    }
}
