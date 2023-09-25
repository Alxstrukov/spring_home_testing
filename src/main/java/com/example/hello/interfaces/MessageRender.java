package com.example.hello.interfaces;

public interface MessageRender {
    void render();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}
