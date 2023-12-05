package de.ait.homework54;

// Класс Album
public class Album {
    private final String title;
    private final String artist;
    private final MusicGenre genre;

    public Album(String title, String artist, MusicGenre genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    // геттеры для полей

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre=" + genre +
                '}';
    }


    public boolean getGenre() {
        return false;
    }
}
