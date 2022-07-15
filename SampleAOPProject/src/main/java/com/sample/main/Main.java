package com.sample.main;

import com.sample.beans.Song;
import com.sample.beans.VehicleService;
import com.sample.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[]) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Song song = new Song();
        song.setTitle("LOVE");
        song.setSingerName("Dharani");
        VehicleService vehicleService=context.getBean(VehicleService.class);
        System.out.println(vehicleService.getClass());
        boolean vehicleStarted=true;
        String playMusic=vehicleService.playMusic(vehicleStarted,song);
        String rotateVehicle=vehicleService.rotate(vehicleStarted);
    }
}
