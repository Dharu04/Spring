package com.sample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import com.sample.beans.VehicleService;
import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LoggerAspects {

    private Logger logger = Logger.getLogger(LoggerAspects.class.getName());

    @Around("execution(* com.sample.beansss.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info(joinPoint.getSignature().toString()+"method starts");
        Instant start =Instant.now();
        joinPoint.proceed();
        Instant end =Instant.now();
        long timeTaken= Duration.between(start,end).toMillis();
        logger.info("timetaken "+timeTaken);
        logger.info(joinPoint.getSignature().toString()+"method ended");
    }


    @Around("@annotation(com.sample.interfaces.LogAspect)")
    public void logwithAnnotation(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info(joinPoint.getSignature().toString()+"method starts");
        Instant start =Instant.now();
        joinPoint.proceed();
        Instant end =Instant.now();
        long timeTaken= Duration.between(start,end).toMillis();
        logger.info("timetaken "+timeTaken);
        logger.info(joinPoint.getSignature().toString()+"method ended");
    }

    @AfterThrowing(value = "execution(* com.sample.beans.*.*(..))", throwing = "ex")
    public void logException(JoinPoint joinPoint, Exception ex) throws Throwable {
        logger.log(Level.SEVERE, joinPoint.getSignature()+ "An excpetion thrown  @AfterThrowing ");
    }

    @AfterReturning(value = "execution(* com.sample.beans.*.*(..))", returning = "retVal")
    public void logStatus(JoinPoint joinPoint, Object retVal) throws Throwable {
        logger.log(Level.INFO, joinPoint.getSignature()+ "method got successfully generated  @AfterReturning"+retVal.toString()  );

    }


}


