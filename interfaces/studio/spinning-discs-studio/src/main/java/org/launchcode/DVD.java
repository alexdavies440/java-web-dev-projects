package org.launchcode;

public class DVD extends PhysicalMedia implements ReadOnly {
    Object dvdData;

    public DVD(String name, double weight, Object dvdData) {
        super(name, weight);
        this.dvdData = dvdData;
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
