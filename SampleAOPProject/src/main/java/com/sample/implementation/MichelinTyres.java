package com.sample.implementation;

import com.sample.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres {
    @Override
    public String rotate(){
        return "moving vehicle with Michelin tyres ";
    }
}
