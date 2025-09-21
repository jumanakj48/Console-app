package MusicApp;

public class Song {

    private String song;
    private String movie;
    private String artist;
    private int year;
    private String genre;

    Song(String song, String movie, String artist, int year, String genre) {
        this.song = song;
        this.movie = movie;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
    }

    public String getSong() {
        return this.song;
    }

    public String getMovie() {
        return this.movie;
    }

    public String getArtist() {
        return this.artist;
    }

    public int getYear() {
        return this.year;
    }

    public String getGenre() {
        return this.genre;
    }

}
