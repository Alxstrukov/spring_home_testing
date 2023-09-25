package com.example.penetration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/penetration_context.xml");
        Car car = (Car) context.getBean("car");
        System.out.println(car.getCarModel());
        System.out.println(car.getCarAge());
        System.out.println(car.getDevice());
    }
}
