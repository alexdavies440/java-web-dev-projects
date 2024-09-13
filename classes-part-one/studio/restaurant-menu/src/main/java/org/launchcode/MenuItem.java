package org.launchcode;

import java.util.ArrayList;

public class MenuItem {

private Double price;
private String description;
private String category;

public MenuItem(Double price, String description, String category) {
    this.price = price;
    this.description = description;
    this.category = category;
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
