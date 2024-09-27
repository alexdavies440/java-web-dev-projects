package org.launchcode;

public class CD extends PhysicalMedia implements ReadOnly {
    Object cdData;

    public CD(String name, double weight, Object cdData) {
        super(name, weight);
        this.cdData = cdData;
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
