package org.launchcode;

public class Cassette extends PhysicalMedia implements ReWritable {
    int tapeLength;
    Object tapeData;
    public Cassette(String name, double weight, int tapeLength, Object tapeData) {
        super(name, weight);
        this.tapeLength = tapeLength;
        this.tapeData = tapeData;
    }

    @Override
    public void reWrite(Object newData) {
        this.tapeData = newData;
    }
}
