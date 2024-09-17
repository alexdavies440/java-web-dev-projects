package org.launchcode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(LocalDate d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public String getLastUpdated() {
        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return lastUpdated.format(formattedDate);
    }

    public ArrayList<MenuItem> getItems() { return items; }
}


