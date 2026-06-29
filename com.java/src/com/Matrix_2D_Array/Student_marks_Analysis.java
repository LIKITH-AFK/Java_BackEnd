package com.Matrix_2D_Array;

public class Student_marks_Analysis {

    public static void main(String[] args) {
        int a[][] = {
                {10,20,30,40},
                {50,60,70,80},
                {20,30,40,50}
        };

        int student1 = 0;
        int student2 = 0;
        int student3 = 0;

        for (int i = 0; i < a.length; i++) {
//        	int sum;
            for (int j = 0; j < a.length+1; j++) {

                if (i == 0)
                    student1 += a[i][j];
                else if (i == 1)
                    student2 += a[i][j];
                else
                    student3 += a[i][j];
            }
        }

        System.out.println("Student 1 Total = " + student1);
        System.out.println("Student 2 Total = " + student2);
        System.out.println("Student 3 Total = " + student3);

        if (student1 > student2 && student1 > student3)
            System.out.println("Highest Scorer: Student 1");
        else if (student2 > student1 && student2 > student3)
            System.out.println("Highest Scorer: Student 2");
        else
            System.out.println("Highest Scorer: Student 3");
    }
}