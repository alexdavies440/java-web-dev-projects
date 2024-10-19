package org.launchcode;

public class Contact {
    private  int id;
    private static int nextId = 1;

    private String name;
    private String phoneNumber;
    private Birthday birthday;

    public Contact() {
        id = nextId;
        nextId++;
    }

    public Contact(String name, String phoneNumber, Birthday birthday) {
        this();
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }
}
