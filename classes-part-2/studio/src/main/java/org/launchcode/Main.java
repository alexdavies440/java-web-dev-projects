package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem breadSticks = new MenuItem(2.99, "Bread sticks", "Appetizer", false);
        MenuItem salad = new MenuItem(5.00, "Caesar Salad", "Appetizer", true);

        MenuItem cheeseBurger = new MenuItem(10.99, "Burger with cheese", "Entree", false);
        MenuItem meatLoaf = new MenuItem(8.99, "Meatloaf", "Entree", true);

        MenuItem bakedAlaska = new MenuItem(7.00, "Baked Alaska", "Dessert", true);
        MenuItem cheeseCake = new MenuItem(8.98, "Chocolate cheesecake", "Dessert", false);

        ArrayList<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(breadSticks);
        menuItems.add(salad);
        menuItems.add(cheeseBurger);
        menuItems.add(meatLoaf);
        menuItems.add(bakedAlaska);
        menuItems.add(cheeseCake);

        Menu ourMenu = new Menu(LocalDate.now(), menuItems);

        String currentCategory = "";

        for (MenuItem item : ourMenu.getItems()) {
            if (item.equalsCategory(currentCategory)) {
                System.out.println(item);
            } else {
                currentCategory = item.category;
                System.out.println(currentCategory  + "s: ");
                System.out.println(item);
            }
        }
  }
}
