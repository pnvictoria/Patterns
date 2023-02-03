package org.example.controller;

import org.example.enums.AudioType;
import org.example.interfaces.AdvancedMediaPlayer;
import org.example.interfaces.MediaPlayer;
import org.example.model.AviPlayer;
import org.example.model.Mp4Player;
import org.example.model.VlcPlayer;

import static org.example.enums.AudioType.*;

public class MediaAdapter implements MediaPlayer {
    public AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(AudioType audioType) {
        if (audioType.equals(VLC)) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equals(MP4)) {
            advancedMusicPlayer = new Mp4Player();
        } else if (audioType.equals(AVI)) {
            advancedMusicPlayer = new AviPlayer();
        }
    }

    @Override
    public void play(AudioType audioType, String fileName) {
        if (audioType.equals(VLC)) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equals(MP4)) {
            advancedMusicPlayer.playMp4(fileName);
        } else if (audioType.equals(AVI)) {
            advancedMusicPlayer.playAvi(fileName);
        }
    }
}
