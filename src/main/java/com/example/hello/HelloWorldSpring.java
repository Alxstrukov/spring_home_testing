package com.example.hello;

import com.example.hello.interfaces.MessageRender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/app_context.xml");
        MessageRender messageRender = context.getBean("render", MessageRender.class);
        messageRender.render();
    }
}
