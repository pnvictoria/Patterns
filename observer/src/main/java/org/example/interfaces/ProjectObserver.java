package org.example.interfaces;

public interface ProjectObserver {
    void addObserver(Observers observers);
    void removeObserver(Observers observers);
    void notifiesObserver();
}
