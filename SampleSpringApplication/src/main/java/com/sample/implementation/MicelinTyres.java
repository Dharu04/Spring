package com.sample.implementation;

import com.sample.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MicelinTyres implements Tyres {

    @Override
    public String rotate() {
        return "Moving iwth MecelinTyres";
    }
}
