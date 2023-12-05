package de.ait.homework54;

import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {
    private final List<Album> albums = new ArrayList<>();

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public List<Album> getAlbumsByGenre(MusicGenre genre) {
        List<Album> result = new ArrayList<>();
        for (Album album : albums) {

            result.add(album);
        }
        return result;
    }


    public String getAlbums() {
        return null;
    }


    // другие методы, если необходимо
}
