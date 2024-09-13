package org.launchcode;
import java.sql.Array;
import java.time.LocalDate;
import java.util.*;
import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        // write your code here


        MenuItem bread = new MenuItem(5.00, "Rye Bread smeared with butter", " Appetizer ");
        MenuItem chickenWings = new MenuItem(82.75, "A bathtub full of spicy chicken wings, bathed in hot sauce and ranch", "Entree");
        MenuItem ultimatePBJ = new MenuItem(4.50, "Choke on two inches of peanutbutter and grape jelly between two slices of sandwich bread, comes with a pint of milk", "Dessert");

        ArrayList<ArrayList> finalMenu = new ArrayList<>();

        ArrayList<Object> breadApp = new ArrayList();
        {
            breadApp.add(bread.getPrice());
            breadApp.add(bread.getDescription());
            breadApp.add(bread.getCategory());
        }

        ArrayList<Object> chxWingsEntree = new ArrayList();
        {
            chxWingsEntree.add(chickenWings.getPrice());
            chxWingsEntree.add(chickenWings.getDescription());
            chxWingsEntree.add(chickenWings.getCategory());
        }

        ArrayList<Object> PBJDessert = new ArrayList<>();
        {
            PBJDessert.add(ultimatePBJ.getPrice());
            PBJDessert.add(ultimatePBJ.getDescription());
            PBJDessert.add(ultimatePBJ.getCategory());
        }

        finalMenu.add(breadApp);
        finalMenu.add(chxWingsEntree);
        finalMenu.add(PBJDessert);

        Menu menu = new Menu(LocalDate.now() , finalMenu);


        System.out.println(menu.getLastUpdated());
        System.out.println(menu.getItemsOnMenu());
    }
}
