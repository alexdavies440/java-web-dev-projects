package org.launchcode;

import javax.swing.text.DateFormatter;
import java.io.OutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        // write your code here

        MenuItem breadSticks = new MenuItem(2.99, "Bread sticks", "Appetizer", false);
        MenuItem salad = new MenuItem(5.00, "Caesar Salad", "Appetizer", true);
        MenuItem ryeBread = new MenuItem(5.00, "Rye Bread", "Appetizer", true);
        MenuItem tatorTots = new MenuItem(5.00, "Tator Tots", "Appetizer", false);
        MenuItem pbj = new MenuItem(2.00, "Hand-Scooped Peanutbutter", "Appetizer", false);

        MenuItem cheeseBurger = new MenuItem(10.99, "Burger with Cheese", "Entree", false);
        MenuItem meatLoaf = new MenuItem(8.99, "Meatloaf", "Entree", true);
        MenuItem tunaCasserole = new MenuItem(9.80, "Steamy Tuna Casserole", "Entree", true);
        MenuItem grilledPBJ = new MenuItem(7.00, "Charcoal-Grilled Peanutbutter & Jelly", "Entree", true);
        MenuItem steak = new MenuItem(15.00, "Steak", "Entree", false);

        MenuItem bakedAlaska = new MenuItem(7.00, "Baked Alaska", "Dessert", true);
        MenuItem cheeseCake = new MenuItem(8.98, "Chocolate cheesecake", "Dessert", false);
        MenuItem PBJ = new MenuItem(2.00, "More Peanututter", "Dessert", false);
        MenuItem chocolateCake = new MenuItem(6.00, "Chocolate Cake Slice", "Dessert", true);

        ArrayList<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(breadSticks);
        menuItems.add(salad);
        menuItems.add(ryeBread);
        menuItems.add(tatorTots);
        menuItems.add(pbj);

        menuItems.add(cheeseBurger);
        menuItems.add(meatLoaf);
        menuItems.add(tunaCasserole);
        menuItems.add(grilledPBJ);
        menuItems.add(steak);

        menuItems.add(bakedAlaska);
        menuItems.add(cheeseCake);
        menuItems.add(PBJ);
        menuItems.add(chocolateCake);

        Menu ourMenu = new Menu(LocalDate.now(), menuItems);

        System.out.println("\n" + "Menu:");
        String currentCategory = "";

        for (MenuItem item : ourMenu.getItems()) {
            if (item.equalsCategory(currentCategory)) {
                System.out.println(item);
            } else {
                currentCategory = item.getCategory();
                System.out.println("\n" + "~~~ " + currentCategory  + "s ~~~" + "\n");
                System.out.println(item);
            }
        }
        System.out.println("\n" + "Last updated: " + ourMenu.getLastUpdated());
  }
}
