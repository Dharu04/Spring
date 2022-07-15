package com.sample.main;

import com.sample.beans.Person;
import com.sample.beans.Vehicle;
import com.sample.config.ProjectConfig;
import com.sample.services.VehicleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.beans.VetoableChangeListener;

public class Main {

    public static void main(String args[]) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("This is new sample project");
        String[] persons=context.getBeanNamesForType(Person.class);
        Person person=context.getBean(Person.class);
        Vehicle vehicle=context.getBean(Vehicle.class);
        String[] vehicles=context.getBeanNamesForType(Vehicle.class);
        vehicle.getVehicleService().makeSound();
        vehicle.getVehicleService().moveVehicle();
        person.getVehicle().getVehicleService().moveVehicle();
        person.getVehicle().getVehicleService().makeSound();

        VehicleService vehicleService= context.getBean(VehicleService.class);
        String[] vehicleService11=context.getBeanNamesForType(VehicleService.class);
        VehicleService vehicleService2= context.getBean( VehicleService.class);
        String[] vehicleService22=context.getBeanNamesForType(VehicleService.class);
        System.out.println("hashcode->"+vehicleService.hashCode());
        System.out.println("hashcode2--->"+vehicleService2.hashCode());

        if(vehicleService==vehicleService2){
            System.out.println("Singleton invoked");
        }else{
            System.out.println("Prototypoe invoked");
        }
    }
}
