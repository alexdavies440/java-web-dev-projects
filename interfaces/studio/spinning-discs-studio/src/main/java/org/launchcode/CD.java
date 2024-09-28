package org.launchcode;

public class CD extends PhysicalMedia implements ReadOnly {
    Object cdData;

    public CD(String name, double weight, Object cdData) {
        super(name, weight);
        this.cdData = cdData;
    }
    // TODO: Implement your custom interface.

    @Override
    public void read() {
        System.out.println("Now reading " + name);
    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
