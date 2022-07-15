package com.sample.beans;

import com.sample.interfaces.LogAspect;
import com.sample.interfaces.Speakers;
import com.sample.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;
import java.util.logging.Level;


@Component
public class VehicleService {

    private Logger logger = Logger.getLogger(VehicleService.class.getName());



    @Autowired
    private Speakers speakers;
   private Tyres tyres;


    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }
    public Tyres getTyres() {
        return tyres;
    }


    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
    @LogAspect
    public String playMusic(boolean vehicleStarted,Song song) {
        /*logger.info("method started");
        Instant start =  Instant.now();*/
        /*String music = null;
        if (vehicleStarted) {
            music = speakers.playMusic(song);
            logger.info("music ");
        }else{
            logger.log(Level.SEVERE,"vehicle not started");
        }*/
        /*Instant end = Instant.now();
        long timeElasped = Duration.between(start,end).toMillis();
        logger.info("time taken"+timeElasped);
        logger.info("method ended");*/

        //throw new NullPointerException("Damn null pointer exception");

        return speakers.playMusic(song);
    }
    @LogAspect
    public String rotate(boolean vehicleStarted) {
        /*logger.info("method started");
        Instant start =  Instant.now();*/
        /*String tyre = null;
        if (vehicleStarted) {
            tyre = tyres.rotate();
        }else{
            logger.log(Level.SEVERE,"vehicle not started");
        }*/
       /* Instant end = Instant.now();
        long timeElasped = Duration.between(start,end).toMillis();
        logger.info("time taken"+timeElasped);
        logger.info("method ended");*/
        return tyres.rotate();
    }
}
