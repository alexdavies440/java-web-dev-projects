package org.launchcode;
import java.sql.Array;
import java.time.LocalDate;
import java.util.*;
import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        // write your code here


        MenuItem bread = new MenuItem("Rye Bread", 5.00, "Bread with embedded butter", " Appetizer ");
        MenuItem chickenWings = new MenuItem("The Last Supper", 82.75, "A bathtub full of spicy chicken wings, bathed in hot sauce and ranch", "Entree");
        MenuItem ultimatePBJ = new MenuItem("PBJ", 4.50, "Choke on two inches of peanutbutter and grape jelly between two slices of sandwich bread, comes with a pint of milk", "Dessert");

        ArrayList<MenuItem> finalMenu = new ArrayList<>();

//        ArrayList<Object> breadApp = new ArrayList();
//        {
//            breadApp.add(bread.getPrice());
//            breadApp.add(bread.getDescription());
//            breadApp.add(bread.getCategory());
//        }
//
//        ArrayList<Object> chxWingsEntree = new ArrayList();
//        {
//            chxWingsEntree.add(chickenWings.getPrice());
//            chxWingsEntree.add(chickenWings.getDescription());
//            chxWingsEntree.add(chickenWings.getCategory());
//        }
//
//        ArrayList<Object> PBJDessert = new ArrayList<>();
//        {
//            PBJDessert.add(ultimatePBJ.getPrice());
//            PBJDessert.add(ultimatePBJ.getDescription());
//            PBJDessert.add(ultimatePBJ.getCategory());
//        }

        finalMenu.add(bread);
        finalMenu.add(chickenWings);
        finalMenu.add(ultimatePBJ);

        Menu menu = new Menu(LocalDate.now() , finalMenu);

        for (MenuItem item : finalMenu) {
            System.out.println(item);
        }
//        System.out.println(menu.getLastUpdated());
//        System.out.println(menu.getItemsOnMenu());
    }
}
