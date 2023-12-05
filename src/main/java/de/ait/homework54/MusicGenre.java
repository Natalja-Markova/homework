package de.ait.homework54;
import java.util.ArrayList;
import java.util.List;
public enum MusicGenre {
    POP("Popular and mainstream music"),
    ROCK("Rock and Roll"),
    JAZZ("Jazz"),
    CLASSICAL("Classical"),
    ELECTRONIC("Electronic Dance Music"),
    HIPHOP("Hip Hop");

private final String description;

        MusicGenre(String description) {
        this.description = description;
        }

public String getDescription() {
        return description;
        }
        }

// Класс MusicLibrary


