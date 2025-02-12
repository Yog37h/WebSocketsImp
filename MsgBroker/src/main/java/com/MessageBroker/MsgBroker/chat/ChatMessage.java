package com.MessageBroker.MsgBroker.chat;


public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;

    // Default constructor
    public ChatMessage() {
    }

    // All arguments constructor
    public ChatMessage(MessageType type, String content, String sender) {
        this.type = type;
        this.content = content;
        this.sender = sender;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    // Manually added Builder class
    public static class Builder {
        private MessageType type;
        private String content;
        private String sender;

        // Builder methods to set properties
        public Builder type(MessageType type) {
            this.type = type;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder sender(String sender) {
            this.sender = sender;
            return this;
        }

        // Build method to return the final object
        public ChatMessage build() {
            return new ChatMessage(type, content, sender);
        }
    }

    // Public static builder method to initialize the Builder
    public static Builder builder() {
        return new Builder();
    }
}
