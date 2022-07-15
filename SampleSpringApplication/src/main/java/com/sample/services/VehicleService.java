package com.sample.services;

import com.sample.interfaces.Speakers;
import com.sample.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class VehicleService {

    public VehicleService(){
        System.out.println("Vehicleservice bean created");
    }

    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public void makeSound(){
        String music =speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle(){
        String status =tyres.rotate();
        System.out.println(status);
    }

}
