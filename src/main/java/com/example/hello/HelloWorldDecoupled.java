package com.example.hello;

import com.example.hello.interfaces.MessageProvider;
import com.example.hello.interfaces.MessageRender;

public class HelloWorldDecoupled {
    public static void main(String[] args) {
        MessageRender mr = new StandardMessageRender();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
