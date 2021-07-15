package com.webrtc.model;

public class ChatMessage {
    private String sender;

    private String content;

    private ChatType type;

    public ChatType getType() {
        return type;
    }

    public void setType(ChatType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ChatMessage() {
    }

    public ChatMessage(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
