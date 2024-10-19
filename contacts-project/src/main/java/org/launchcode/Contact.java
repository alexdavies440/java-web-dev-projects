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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String s = System.lineSeparator();
        return s + name + s + phoneNumber + s + birthday + s;
    }
}
