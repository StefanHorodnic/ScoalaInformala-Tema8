package org.example;

import java.time.LocalDateTime;

public class PhoneCall {

    private LocalDateTime dateTime;
    private String recipientPhoneNumber;

    public PhoneCall(LocalDateTime dateTime, String recipientPhoneNumber) {
        this.dateTime = dateTime;
        this.recipientPhoneNumber = recipientPhoneNumber;
    }

    public String getRecipientPhoneNumber() {
        return recipientPhoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneCall{" +
                "dateTime=" + dateTime +
                ", recipientPhoneNumber='" + recipientPhoneNumber + '\'' +
                '}';
    }
}
