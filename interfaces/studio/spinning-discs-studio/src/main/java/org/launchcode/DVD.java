package org.launchcode;

public class DVD extends PhysicalMedia implements ReadOnly {
    Object dvdData;
    double hoursLong;

    public DVD(String name, double weight, double hoursLong, Object dvdData) {
        super(name, weight);
        this.hoursLong = hoursLong;
        this.dvdData = dvdData;
    }

    // TODO: Implement your custom interface.

    @Override
    public void read() {
        System.out.println("Now playing " + super.name);
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
