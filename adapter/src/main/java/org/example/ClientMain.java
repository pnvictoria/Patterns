package org.example;

import org.example.controller.AudioPlayer;

import static org.example.enums.AudioType.*;

public class ClientMain {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play(AVI, "beyond the horizon.mp3");
        audioPlayer.play(MP4, "alone.mp4");
        audioPlayer.play(VLC, "far far away.vlc");
        audioPlayer.play(MP3, "mind me.avi");
        audioPlayer.play(MP5, "mind me.avi");
    }
}
