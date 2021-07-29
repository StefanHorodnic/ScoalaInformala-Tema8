package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Phone {

    private int imei;
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

    public int getImei() {
        return imei;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public Phone() {
        Random random = new Random();
        imei = random.nextInt(10000000);
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
                '}';
    }
}
