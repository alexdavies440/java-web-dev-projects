package org.launchcode;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // Test out your Divide() function!
        Divide(10, 2);
        Divide(10, 0); //Throws exception

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (String i : studentFiles.keySet()) {
            System.out.println(i + ": " + CheckFileExtension(studentFiles.get(i)));
        }

    }

    public static void Divide(int x, int y) {
        if (y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by zero (Silly goose!)");
            } catch (ArithmeticException e) {
                e.getStackTrace();
                System.out.println(e.getMessage());
            }
        }
        int result = x / y;
        System.out.println(x + "/" + y + " = " + result);
    }

    public static int CheckFileExtension(String fileName) {
        int points = 0;

        if (fileName.endsWith(".java")) {
            points = 1;
        }
        else if (fileName.isEmpty()) {
            try {
                throw new Exception("File Name Empty!");
            } catch(Exception e) {
                e.getMessage();
                e.printStackTrace();
            }
            points = -1;
        }
        else {
            points = 0;
        }

        return points;
    }
}