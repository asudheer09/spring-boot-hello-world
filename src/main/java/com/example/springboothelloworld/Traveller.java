package com.example.springboothelloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Traveller {
    Vehicle vehicle;

    @Autowired
    public void setVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
    }

    public  void startJourney(){
        vehicle.move();
    }

}
