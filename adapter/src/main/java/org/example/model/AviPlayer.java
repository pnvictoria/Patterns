package org.example.model;

import org.example.interfaces.AdvancedMediaPlayer;

public class AviPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Cannot play vlc file. Name: "+ fileName);
    }

    @Override
    public void playAvi(String fileName) {
        System.out.println("Playing avi file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Cannot play mp4 file. Name: "+ fileName);
    }
}
