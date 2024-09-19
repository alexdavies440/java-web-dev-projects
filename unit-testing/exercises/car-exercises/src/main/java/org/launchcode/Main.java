package org.launchcode;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Prius", 10, 50);
        //System.out.println(car.getMake() + " - " + car.getModel());
        Car selectedCar = car;
        //System.out.println(selectedCar.getMake() + " " + selectedCar.getModel() + "\n" + "Tank Capacity: " +  selectedCar.getGasTankLevel() + "\n" + "MPG: " + selectedCar.getMilesPerGallon());
        do {
            System.out.println("SELECTED CAR: " + "\n" + selectedCar.getMake() + " " + selectedCar.getModel() + "\n" + "Fuel Level: " +  selectedCar.getGasTankLevel() + "\n" + "MPG: " + selectedCar.getMilesPerGallon());
            System.out.println();
            System.out.println("Enter: " + "\n" + "'a' to add gas" + "\n" + "'d' to drive" + "\n" + "'n' to build a new car" + "\n" + "'x' to doubt");

            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();

            if (choice.equals("a")) {
                System.out.println("How much gas(+/-)?");
                double gas = input.nextDouble();
                selectedCar.addGas(gas);
            }
            if (choice.equals("d")) {
                System.out.println("How far?");
                double distance = input.nextDouble();
                selectedCar.drive(distance);
            }
            if (choice.equals("n")) {
                System.out.println("What Make?");
                String make = input.nextLine();

                System.out.println("What Model?");
                String model = input.nextLine();

                System.out.println("Tank Capacity?");
                int tank = input.nextInt();

                System.out.println("Miles per Gallon?");
                double mpg = input.nextDouble();
                Car newCar = new Car(make, model, tank, mpg);
                // Start new car off on full tank
                newCar.setGasTankLevel(tank);
                // Switch to this car
                selectedCar = newCar;
            }
            if (choice.equals("x")) {
                //I think there must be a much better way to do this but I need to go to bed for now
                System.out.println("***   ***");
                System.out.println(" *** ***");
                System.out.println("  *****");
                System.out.println("   ***");
                System.out.println("  *****");
                System.out.println(" *** ***");
                System.out.println("***   ***");

            }
        }
        while (selectedCar.getGasTankLevel() > 0);
    }
}