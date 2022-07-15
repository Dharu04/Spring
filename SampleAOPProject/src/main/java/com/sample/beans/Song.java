package com.sample.beans;

import org.springframework.stereotype.Component;


public class Song {

    private String title;
    private String singerName;

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
