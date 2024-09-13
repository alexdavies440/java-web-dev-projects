package org.launchcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<ArrayList> itemsOnMenu;

    public Menu (Date lastUpdated, ArrayList<ArrayList> itemsOnMenu) {
        this.lastUpdated = lastUpdated;
        this.itemsOnMenu = itemsOnMenu;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItemsOnMenu(ArrayList<ArrayList> itemsOnMenu) {
        this.itemsOnMenu = itemsOnMenu;
    }

    public Date getLastUpdated() {
        return getLastUpdated();
    }

    public ArrayList<ArrayList> getItemsOnMenu() {
        return getItemsOnMenu();
    }
}
