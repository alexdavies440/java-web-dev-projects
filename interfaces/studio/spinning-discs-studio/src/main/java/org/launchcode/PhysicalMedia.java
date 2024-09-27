package org.launchcode;

public abstract class PhysicalMedia {
    String name;
    double weight;

    public PhysicalMedia(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}
