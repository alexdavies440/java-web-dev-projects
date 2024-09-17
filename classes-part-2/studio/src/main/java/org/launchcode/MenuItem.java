package org.launchcode;

import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    public String category;
    private boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String toString() {
        String menuEntry = "";
        if (this.isNew) {
             menuEntry = menuEntry.format("$%.2f %s(NEW!)", price, description, isNew);
        } else {
            menuEntry = menuEntry.format("$%.2f %s", price, description);
        }
        return menuEntry;
    }

    public boolean equalsCategory(String category) {
        return (this.category == category);
    }

}


