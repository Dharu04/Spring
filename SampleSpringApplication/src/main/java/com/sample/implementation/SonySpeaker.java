package com.sample.implementation;

import com.sample.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeaker  implements Speakers {

    @Override
    public String makeSound() {
        return "playing with sony speaker";
    }
}
