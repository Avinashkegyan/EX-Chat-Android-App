package com.avi.javachat.Model;

public class Chat {
    private String sender;
    private String receiver;
    private String massage;
    private boolean isseen;

    public Chat(String sender, String receiver, String massage,boolean isseen) {
        this.sender = sender;
        this.receiver = receiver;
        this.massage = massage;
        this.isseen = isseen;
    }

    public Chat() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public boolean isIsseen() {  return isseen; }

    public void setIsseen(boolean isseen) {  this.isseen = isseen; }
}
