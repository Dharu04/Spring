package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args){
        Vehicle v = new Vehicle();
      ///System.out.println(v.setName("qwert"));
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

       /* // inorder to resolve the spring ambiguity we will use @primary annotattion
        Vehicle helloWorld = context.getBean(Vehicle.class);
        helloWorld.setName("Hello World!");
        System.out.println("Normal bean ---> "+ helloWorld.getName());

        String hello = context.getBean(String.class);
        System.out.println("printing the values normal bean -->"+hello);


       //to use the particular bean in the config class
        Vehicle veh = context.getBean("vehicle1", Vehicle.class);
        System.out.println("veh with 2 beans---> "+ veh.getName());

        System.out.println("-------------------------------------");

        //to use the particular bean name or value in the config class
        Vehicle v1 = context.getBean("hondaVehcile", Vehicle.class);
        System.out.println("v1---> "+ v1.getName());

        Vehicle v2 = context.getBean("scrossVehcile", Vehicle.class);
        System.out.println("v2 ---> "+ v2.getName());

        Vehicle v3 = context.getBean("ciazVehcile", Vehicle.class);
        System.out.println("v3 ---> "+ v3.getName());

        System.out.println("-------------------------------------");*/

        Vehicle withPrimaryAnnotation = context.getBean(Vehicle.class);
        System.out.println(withPrimaryAnnotation.getName());
    }
}
