package org.example;

public class App {

    public static void main(String[] args) {
        
        Phone phone = new SamsungGalaxyS6();
        phone.setMaterial("Alloy");
        phone.setColor("Gray");

        System.out.println("Created phone " + phone.toString());
        System.out.println("Phone battery = " + phone.getBatteryLife());

        phone.addContact("1", "0743510638", "Ștefan", "Horodnic");
        phone.addContact("2", "0756451265", "Cristian", "Popescu");
        phone.listContacts();

        // send a message to the first contact from the previous listed
        // max number of characters - 100
        phone.sendTextMessage("0743510638", "mesajul 1");
        phone.sendTextMessage("0756451265", "mesajul 2");
        phone.listTextMessages("0743510638");

        // call the second contact from the previous listed
        phone.call("0756451265");
        phone.viewCallHistory();

        System.out.println("Phone battery = " + phone.getBatteryLife());
    }
}
