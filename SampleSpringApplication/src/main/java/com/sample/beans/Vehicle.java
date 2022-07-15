package com.sample.beans;

import com.sample.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "vehicleBean")
public class Vehicle {

    private String vehicleName ="scross";

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleName='" + vehicleName + '\'' +
                ", vehicleService=" + vehicleService +
                '}';
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }

    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }


    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
