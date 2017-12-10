package com.example.thomas.firebasechat;


public class Message {

    public String content;
    public String userName;
    public Long timestamp;

    public Message() {
        // Empty constructor for Firebase
    }

    public Message(String content, String userName, Long timestamp) {
        this.content = content;
        this.userName = userName;
        this.timestamp = timestamp;
    }
}
