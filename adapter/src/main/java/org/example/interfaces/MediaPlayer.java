package org.example.interfaces;

import org.example.enums.AudioType;

public interface MediaPlayer {
    void play(AudioType audioType, String fileName);
}
