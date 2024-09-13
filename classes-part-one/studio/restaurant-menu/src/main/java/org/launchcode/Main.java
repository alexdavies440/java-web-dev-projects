package org.launchcode;
import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem bread = new MenuItem(5.00, "Rye Bread smeared with butter", " Appetizer ");
        MenuItem chickenWing = new MenuItem(82.75, "A bathtub full of spicy chicken wings, bathed in hot sauce and ranch", "Entree");
        MenuItem ultimatePBJ = new MenuItem(4.50, "Choke on two inches of peanutbutter and grape jelly between two slices of sandwhich bread, comes with a pint of milk", "Dessert");



        System.out.println(bread);
    }
}
