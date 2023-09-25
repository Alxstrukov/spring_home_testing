package com.example.hello;

import com.example.hello.interfaces.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello world";
    }
}
