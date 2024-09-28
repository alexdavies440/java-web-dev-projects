package org.launchcode;

public class Main {
    public static void main(String[] args) {
        Object WeddingData = new Object();
        Object LordOfTheRingsClosing = new Object();
        Object Soundtrack = new Object();

        // TODO: Declare and initialize a CD and a DVD object.
        CD weddingCD = new CD("Wedding Photos", 0.02, WeddingData);
        DVD lordOfTheRingsCredits = new DVD("Lord of the Rings Closing Credits", 0.2, 3.0, LordOfTheRingsClosing);
        Cassette testCassette = new Cassette("Passion of the Christ Soundtrack", 0.2, 90, Soundtrack);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        weddingCD.reWrite();
        weddingCD.read();
        lordOfTheRingsCredits.read();
    }
}