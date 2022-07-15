package com.sample.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value = "personBean")

public class Person {
    private String personName = "Dharani";



    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {

        System.out.println("Person bean created now");
        this.vehicle = vehicle;
    }


    public Vehicle getVehicle() {
        return vehicle;
    }


    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }


}
