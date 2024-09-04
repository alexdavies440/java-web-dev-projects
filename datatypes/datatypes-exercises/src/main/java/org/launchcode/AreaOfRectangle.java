package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many inches long?");
        int length = input.nextInt();

        System.out.println("How many inches wide?");
        int width = input.nextInt();

        input.close();

        int area = length * width;
        System.out.println("The area of the rectangle is " + area + " inches.");
    }

}
