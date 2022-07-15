package com.sample.implementation;

import com.sample.beans.Song;
import com.sample.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeaker implements Speakers {

    @Override
    public String playMusic( Song song){
        return "playing music in bose "+ song.getTitle() +song.getSingerName();
    }
}
