package MusicApp;

import java.util.ArrayList;
import java.util.HashMap;

public class SongManager {
    ArrayList<Song> songList;
    static HashMap<String, Song> songMap;
    HashMap<String, ArrayList<Song>> genreCatalog;
    HashMap<String, ArrayList<Song>> artistCatalog;
    HashMap<String, ArrayList<Song>> movieCatalog;

    public SongManager() {
        genreCatalog = new HashMap<>();
        songMap = new HashMap<>();
        songList = new ArrayList<>();
        artistCatalog = new HashMap<>();
        movieCatalog = new HashMap<>();
    }

    public void addSong(String songName, String movie, String artist, int year, String genre) {
        Song song = new Song(songName, movie, artist, year, genre);
        songList.add(song);
        songMap.put(songName, song);
        ArrayList<Song> genreList = genreCatalog.getOrDefault(genre, new ArrayList<>());
        genreList.add(song);
        genreCatalog.put(genre, genreList);
        ArrayList<Song> artistList = artistCatalog.getOrDefault(genre, new ArrayList<>());
        artistList.add(song);
        genreCatalog.put(artist, artistList);
        ArrayList<Song> movieList = artistCatalog.getOrDefault(genre, new ArrayList<>());
        movieList.add(song);
        genreCatalog.put(artist, movieList);

    }

    public static HashMap<String, Song> getSongMap() {
        return songMap;
    }

    public void displaySongsByGenre(String genreType) {
        ArrayList<Song> genreList = genreCatalog.get(genreType);

        if (genreList != null) {
            System.out.println("----------------------------------");
            System.out.println(genreType);
            int count = 1;
            for (Song song : genreList) {
                System.out.println(count + " ) " + song.getSong());
                count++;

            }
            System.out.println("----------------------------------");
        }

    }

    public void play(String songName) {
        System.out.println("Playing......" + songName);
    }

}
