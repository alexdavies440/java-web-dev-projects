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
        System.out.println(result);
    }

//    public static int CheckFileExtension(String fileName)
//    {
//        // Write code here!
//    }
}