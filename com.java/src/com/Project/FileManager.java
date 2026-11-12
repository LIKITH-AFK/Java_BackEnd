package com.Project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileManager {

    // Save any object into a file
    public static void saveData(
            String fileName,
            Object data) {

        try {

            FileOutputStream fos =
                    new FileOutputStream(fileName);

            ObjectOutputStream oos =
                    new ObjectOutputStream(fos);

            oos.writeObject(data);

            oos.close();
            fos.close();

            System.out.println(
                    "Data saved successfully."
            );

        } catch (IOException e) {

            System.out.println(
                    "Error while saving data: "
                    + e.getMessage()
            );
        }
    }

    // Read object from file
    public static Object readData(
            String fileName) {

        try {

            FileInputStream fis =
                    new FileInputStream(fileName);

            ObjectInputStream ois =
                    new ObjectInputStream(fis);

            Object data = ois.readObject();

            ois.close();
            fis.close();

            return data;

        } catch (IOException |
                 ClassNotFoundException e) {

            return null;
        }
    }
}