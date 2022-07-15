package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle(){
        return new Vehicle();
    }

    @Bean
    public String HelloWord(){
        return  "HelloWord";
    }

    @Bean
    Vehicle vehicle1(){
        Vehicle veh = new Vehicle();
        veh.setName("audi");
        return veh ;
    }


    @Bean(value="hondaVehcile")
    Vehicle v1(){
        Vehicle ve1= new Vehicle();
        ve1.setName("honda");
        return ve1;
    }

    @Bean(name="scrossVehcile")
    Vehicle v2(){
        Vehicle ve2= new Vehicle();
        ve2.setName("scross");
        return ve2;
    }

    @Primary
    @Bean("ciazVehcile")
    Vehicle v3(){
        Vehicle ve3 = new Vehicle();
        ve3.setName("ciaz");
        return ve3;
    }

}