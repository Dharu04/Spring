package com.sample.config;

import com.sample.beans.Vehicle;
import com.sample.services.VehicleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackageClasses = {com.sample.beans.Vehicle.class,com.sample.beans.Person.class})
@ComponentScan(basePackages = {"com.sample.implementation","com.sample.services"})
public class ProjectConfig {

}
