package MusicApp;

public class MusicApp {

    public static void main(String[] args) {
        SongManager songManager = new SongManager();

        songManager.addSong("idhazhin oram", "3", "anirudh", 2012, "love");
        songManager.addSong("AAluma doluma", "vedhalam", "anirudh", 2016, "folk");
        songManager.addSong("beep song", "Beep", "STR", 2012, "motivation");
        songManager.addSong("why this kolaveri", "3", "anirudh", 2012, "love");
        songManager.addSong("Arjunar villu", "gilli", "unknown", 2008, "motivation");

        Usermanagement usermanagement = new Usermanagement();
        usermanagement.addUser("Harishh", "9790541002");

        User user1 = usermanagement.getUser("9790541002");

        user1.createPlayList("healings", "idhazhin oram", "beep song", "why this kolaveri");

        user1.getPlaylist("healings");
        songManager.displaySongsByGenre("love");
        songManager.displaySongsByGenre("motivation");

        songManager.play("beep song");

        usermanagement.displayUser("9790541002");
        
        usermanagement.addDevice("9790541002", "d005");
        usermanagement.displayUser("9790541002");
    }

}
