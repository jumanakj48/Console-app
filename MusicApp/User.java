package MusicApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class User {

    @SuppressWarnings("unused")
    private String userName;
    @SuppressWarnings("unused")
    private String phnNumber;
    private HashMap<String, List<Song>> playListCatalog;
    String subscription;
    ArrayList<Device> deviceList;

    User(String userName, String phnNumber) {
        this.userName = userName;
        this.phnNumber = phnNumber;
        playListCatalog = new HashMap<>();
        this.subscription = "free";
        deviceList = new ArrayList<>();
    }

    public void getPlaylist(String playListName) {
        List<Song> list = playListCatalog.get(playListName);
        int count = 1;
        if (list != null) {
            for (Song song : list) {
                System.out.println(count + " )");
                System.out.println("Song : " + song.getSong());
                System.out.println("artist : " + song.getArtist());
                System.out.println("Album : " + song.getMovie());
                count++;

            }
        } else {
            System.out.println("No playlist available named " + playListName);

        }

    }

    public void createPlayList(String playListName, String... songNames) {
        playList playList = new playList(playListName);

        playListCatalog.put(playListName, playList.getPlayList());
        ArrayList<Song> pList = (ArrayList<Song>) playList.getPlayList();

        for (String song : songNames) {
            pList.add(SongManager.getSongMap().get(song));

        }

    }

    public String getUserName() {
        return userName;
    }

    // public List<Song>> getPlayList() {
    // return this.List<Song> ;
    // }

    public String getSubscription() {
        return this.subscription;
    }

    public void setSubscription(String value) {
        this.subscription = value;
    }

    public int getTotalDeviceList() {
        return this.deviceList.size();
    }

    public ArrayList<Device> getDevices() {
        return this.deviceList;
    }

}
