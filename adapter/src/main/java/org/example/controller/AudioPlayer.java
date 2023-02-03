package org.example.controller;

import org.example.enums.AudioType;
import org.example.interfaces.MediaPlayer;

import static org.example.enums.AudioType.*;

public class AudioPlayer implements MediaPlayer {
    public MediaAdapter mediaAdapter;

    @Override
    public void play(AudioType audioType, String fileName) {
        //inbuilt support to play mp3 music files
        if (audioType.equals(MP3)) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        //mediaAdapter is providing support to play other file formats
        else if (audioType.equals(VLC) || audioType.equals(MP4) || audioType.equals(AVI)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
