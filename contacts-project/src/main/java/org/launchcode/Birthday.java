package org.launchcode;

public class Birthday {
    private int day;
    private Month month;

    public Birthday(int day, Month month) {
        this.day = day;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public Month getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return day + " " + month;
    }
}
