package com.example.hello;

import com.example.hello.interfaces.MessageProvider;
import com.example.hello.interfaces.MessageRender;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private Properties props;
    private MessageRender render;
    private MessageProvider provider;

    public MessageSupportFactory() {
        props = new Properties();
        try (FileReader file = new FileReader("src/main/resources/msf.properties")) {
            props.load(file);
            String renderClass = props.getProperty("render.class");
            String providerClass = props.getProperty("provider.class");

            render = (MessageRender) Class.forName(renderClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRender getMessageRender() {
        return render;
    }

    public MessageProvider getMessageProvider() {
        return provider;
    }
}
