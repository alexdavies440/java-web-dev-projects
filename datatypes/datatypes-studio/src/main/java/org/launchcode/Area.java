package org.launchcode;

import java.util.Scanner;

//import static java.lang.Math.PI;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the radius of the circle?");
        Double Radius = input.nextDouble();
        //double Area = 3.14 * Radius * Radius;
        Double Area = Circle.getArea(Radius);

        System.out.println("A circle with a radius of " + Radius + " has an area of " + Area);
    }
}
