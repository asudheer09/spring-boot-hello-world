package com.example.springboothelloworld;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PrintDateTime {
    public void printDateTime(){
        LocalDateTime ldt= LocalDateTime.now();
        int hour=ldt.getHour();
        if(hour<12){
            System.out.println("good morning");
        } else if (hour>12 && hour <21) {
            System.out.println("good afternoon");
        }else{
            System.out.println("good night");
        }
    }
}
