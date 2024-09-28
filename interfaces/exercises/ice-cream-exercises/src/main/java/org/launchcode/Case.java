package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Case {
    private ArrayList<Flavor> flavors = new ArrayList<>();
    private ArrayList<Cone> cones = new ArrayList<>();
    private ArrayList<Topping> toppings = new ArrayList<>();

    public Case(){
        Topping topping1 = new Topping("Chocolate Syrup", 1.00, new ArrayList<>(Arrays.asList("chocolate")));
        Topping topping2 = new Topping("Whipped Cream", 1.00, new ArrayList<>(Arrays.asList("dairy")));
        Topping topping3 = new Topping("Pecans", 2.50, new ArrayList<>(Arrays.asList("pecans")));
        Topping topping4 = new Topping("Secret Sauce", 0.23, new ArrayList<>(Arrays.asList("mayonnaise", "shellfish", "dairy")));
        Topping topping5 = new Topping("Peanutbutter Chips", 1.50, new ArrayList<>(Arrays.asList("peanuts", "soybean oil", "palm oil")));
        Collections.addAll(toppings,topping1, topping2, topping3, topping4, topping5);
//        toppings.add(topping1);
//        toppings.add(topping2);
//        toppings.add(topping3);




        Cone cone1 = new Cone("Waffle", 1.25, new ArrayList<>(Arrays.asList( "gluten")));
        Cone cone2 = new Cone("Sugar", 0.75, new ArrayList<>(Arrays.asList( "gluten")));
        Cone cone3 = new Cone("Wafer", 0.50, new ArrayList<>(Arrays.asList( "gluten")));
        Cone cone4 = new Cone("Bowl", 0.05, new ArrayList<>(Arrays.asList( "none")));
        cones.add(cone1);
        cones.add(cone2);
        cones.add(cone3);
        cones.add(cone4);

        Flavor flavor1 = new Flavor("Vanilla", 0.75, new ArrayList<>(Arrays.asList( "dairy")));
        Flavor flavor2 = new Flavor("Chocolate", 0.75, new ArrayList<>(Arrays.asList( "dairy")));
        Flavor flavor3 = new Flavor("Red Velvet", 0.85, new ArrayList<>(Arrays.asList( "dairy", "red #5")));
        Flavor flavor4 = new Flavor("Rocky Road", 0.85, new ArrayList<>(Arrays.asList( "dairy", "nuts", "gelatin")));
        Flavor flavor5 = new Flavor("Strawberry Sorbet", 0.50, new ArrayList<>(Arrays.asList( "strawberry")));
        flavors.add(flavor1);
        flavors.add(flavor2);
        flavors.add(flavor3);
        flavors.add(flavor4);
        flavors.add(flavor5);
    }

    public ArrayList<Flavor> getFlavors() {
        return flavors;
    }

    public ArrayList<Cone> getCones() {
        return cones;
    }

    public ArrayList<Topping> getToppings() { return toppings; }

    public void setFlavors(ArrayList<Flavor> flavors) {
        this.flavors = flavors;
    }

    public void setCones(ArrayList<Cone> cones) {
        this.cones = cones;
    }
}
