package com.example.springboothelloworld;

import org.springframework.stereotype.Component;

@Component
public class Car implements  Vehicle{

    @Override
    public void move() {
        System.out.println("move the car");
    }
}
