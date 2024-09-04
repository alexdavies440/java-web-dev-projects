package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double milesDriven = input.nextDouble();

        System.out.println("How much gas was consumed?");
        Double fuelConsumed = input.nextDouble();

        Double milesPerGallon = fuelConsumed / milesDriven;
        System.out.println("Miles per gallon: " + milesPerGallon);
    }
}
