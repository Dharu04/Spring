package com.sample.implementation;

import com.sample.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyres {
    @Override
    public String rotate(){
        return "moving vehicle with BridgeStone tyres ";
    }
}
