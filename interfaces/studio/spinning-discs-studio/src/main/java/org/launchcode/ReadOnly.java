package org.launchcode;

public interface ReadOnly {
    default void reWrite() {
        System.out.println("Cannot re-write to media");
    }

    void read();
}
