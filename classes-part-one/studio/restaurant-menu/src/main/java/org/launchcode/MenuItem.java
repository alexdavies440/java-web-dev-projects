package org.launchcode;

import java.util.ArrayList;

public class MenuItem {
private String name;
private Double price;
private String description;
private String category;

public MenuItem(String name, Double price, String description, String category) {
    this.name = name;
    this.price = price;
    this.description = description;
    this.category = category;
}

public String toString() {
    String itemOnMenu = "";
    itemOnMenu = itemOnMenu.format("%s - $%.2f \n %s", this.name, this.price, this.description);
    return itemOnMenu;
}

public void setPrice(Double price) {
    this.price = price;
}

public void setDescription(String description) {
    this.description = description;
}

public void setCategory(String category) {
    this.category = category;
}

public Double getPrice() {
    return price;
}

public String getDescription() {
    return description;
}

public String getCategory() {
    return category;
}
}
