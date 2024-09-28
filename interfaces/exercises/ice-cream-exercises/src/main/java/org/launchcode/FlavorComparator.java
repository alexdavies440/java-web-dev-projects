package org.launchcode;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor o1, Flavor o2) {
        //Sort by name:
        //return o1.getName().compareTo(o2.getName());

        //Sort by number of ingredients:
        if (o1.getAllergens().size() - o2.getAllergens().size() > 0) {
            return 1;
        }
        else if (o1.getAllergens().size() - o2.getAllergens().size() < 0) {
            return -1;
        }
        else return 0;

    }
}
