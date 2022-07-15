package com.sample.implementation;

import com.sample.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speakers {

    @Override
    public String makeSound() {
        return "Playing with bose speaker";
    }
}
