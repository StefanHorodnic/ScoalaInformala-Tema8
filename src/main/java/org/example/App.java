package org.example;

public class App {

    public static void main(String[] args) {

        Phone phone = new SamsungGalaxyS6();
        phone.setMaterial("Alloy");
        phone.setColor("Gray");

        System.out.println("Created phone " + phone.toString());

        phone.addContact("1", "first contact number", "first contact first name", "first contact last name");
        phone.addContact("2", "second contact number", "second contact first name", "second contact last name");
        phone.listContacts();

        // send a message to the first contact from the previous listed
        // max number of characters - 100
        phone.sendTextMessage("first contact number", "message content");
        phone.listTextMessages("first contact number");

        // call the second contact from the previous listed
        phone.call("second contact number");
        phone.viewCallHistory();

        System.out.println(phone.getImei());
        System.out.println(phone.getBatteryLife());
    }
}
