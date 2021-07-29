package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Phone {

    private String imei;
    private List<Contact> contacts = new ArrayList<>();
    private List<TextMessage> sentMessages = new ArrayList<>();
    private List<PhoneCall> phoneCalls = new ArrayList<>();
    private String color;
    private String material;
    private int batteryLife = 100;

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public abstract String getImei();

    public int getBatteryLife() {
        return batteryLife;
    }

    public Phone() {
        imei = LocalDateTime.now().toString();
    }

    public void addContact(String id, String phoneNumber, String firstName, String lastName) {
        contacts.add(new Contact(id, phoneNumber, firstName, lastName));
    }

    public void listContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }
    }

    public void sendTextMessage(String phoneNumber, String messageContent) {
        if (messageContent.length() < 500) {
            System.out.println("Am trimis mesajul: "+ messageContent +" la numărul :" + phoneNumber);
            sentMessages.add(new TextMessage(phoneNumber, messageContent));
            batteryLife = batteryLife - 1;
        } else {
            System.out.println("Ai depășit numărul maxim de caractere");
        }
    }

    public void listTextMessages(String phoneNumber) {
        for (TextMessage textMessage :
                sentMessages) {
            if (textMessage.getRecipientPhoneNumber().equals(phoneNumber)) {
                System.out.println(textMessage.toString());
            }
        }
    }

    public void call(String phoneNumber) {
        System.out.println("Am apelat numărul: "+phoneNumber);
        phoneCalls.add(new PhoneCall(LocalDateTime.now(), phoneNumber));
        batteryLife = batteryLife - 2;
    }

    public void viewCallHistory() {
        for (PhoneCall phoneCall :
                phoneCalls) {
            System.out.println(phoneCall.toString());
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", imei='" + getImei() + "'" +
                '}';
    }
}
