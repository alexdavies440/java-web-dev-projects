package org.launchcode;

public class Main {
    public static void main(String[] args) {

        Month jan = Month.JANUARY;
        Month feb = Month.FEBRUARY;
        Month march = Month.MARCH;
        Month apr = Month.APRIL;

        System.out.println(apr);
        System.out.println(apr.getMonthOrder());

        Birthday alex = new Birthday(3, feb);
        Birthday dominic = new Birthday(14, Month.JULY);

        System.out.println(alex);

        Contact alexContact = new Contact("Alex", "314-555-5555", new Birthday(3, Month.FEBRUARY));
        Contact dominicContact = new Contact("Dominic", "573-555-5555", new Birthday(14, Month.JULY));

        System.out.println(alexContact);
        System.out.println(dominicContact);

    }
}
