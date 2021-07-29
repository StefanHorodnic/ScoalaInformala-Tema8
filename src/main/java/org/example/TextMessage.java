package org.example;

public class TextMessage {

    private String messageContent;
    private String recipientPhoneNumber;

    public TextMessage(String recipientPhoneNumber, String messageContent) {
        this.messageContent = messageContent;
        this.recipientPhoneNumber = recipientPhoneNumber;
    }

    public String getRecipientPhoneNumber() {
        return recipientPhoneNumber;
    }

    @Override
    public String toString() {
        return "TextMessage{" +
                "messageContent='" + messageContent + '\'' +
                ", recipientPhoneNumber='" + recipientPhoneNumber + '\'' +
                '}';
    }
}
