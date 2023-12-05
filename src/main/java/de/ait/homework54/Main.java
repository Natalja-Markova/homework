package de.ait.homework54;

// Тестирование
public class Main {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

        Album album1 = new Album("Album1", "Artist1", MusicGenre.POP);
        Album album2 = new Album("Album2", "Artist2", MusicGenre.ROCK);
        Album album3 = new Album("Album3", "Artist3", MusicGenre.JAZZ);

        library.addAlbum(album1);
        library.addAlbum(album2);
        library.addAlbum(album3);

        System.out.println("All albums: " + library.getAlbums());
        System.out.println("Pop albums: " + library.getAlbumsByGenre(MusicGenre.POP));
    }
}
