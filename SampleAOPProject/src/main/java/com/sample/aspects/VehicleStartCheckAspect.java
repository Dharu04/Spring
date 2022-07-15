package com.sample.aspects;

import com.sample.beans.VehicleService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
@Order(1)
public class VehicleStartCheckAspect {
    private Logger logger =Logger.getLogger(VehicleStartCheckAspect.class.getName());

    @Before("execution(* com.sample.beans.*.*(..)) && args(vehicleStarted,..)")
    public void checkVehicleStarted(JoinPoint joinPoint,boolean vehicleStarted){
        if(!vehicleStarted)
            throw new RuntimeException("Vehcile not started");
    }
}
