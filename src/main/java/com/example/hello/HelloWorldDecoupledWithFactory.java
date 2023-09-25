package com.example.hello;

import com.example.hello.interfaces.MessageProvider;
import com.example.hello.interfaces.MessageRender;

public class HelloWorldDecoupledWithFactory {
    public static void main(String[] args) {
        MessageRender mr = MessageSupportFactory.getInstance().getMessageRender();
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
