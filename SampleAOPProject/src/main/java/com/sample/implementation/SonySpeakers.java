package com.sample.implementation;

import com.sample.beans.Song;
import com.sample.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speakers {
    @Override
    public String playMusic(Song song){
        return "playing music in sony "+song.getSingerName() +song.getTitle();
    }
}

