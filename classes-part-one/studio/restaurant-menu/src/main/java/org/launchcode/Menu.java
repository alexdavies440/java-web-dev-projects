package org.launchcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> itemsOnMenu;

    public Menu (LocalDate lastUpdated, ArrayList<MenuItem> itemsOnMenu) {
        this.lastUpdated = lastUpdated;
        this.itemsOnMenu = itemsOnMenu;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItemsOnMenu(ArrayList<MenuItem> itemsOnMenu) {
        this.itemsOnMenu = itemsOnMenu;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItemsOnMenu() {
        return itemsOnMenu;
    }
}
