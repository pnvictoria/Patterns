package org.example.model;

import org.example.interfaces.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Cannot play vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }

    @Override
    public void playAvi(String fileName) {
        System.out.println("Cannot play avi file. Name: "+ fileName);
    }
}
