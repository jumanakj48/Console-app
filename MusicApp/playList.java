package MusicApp;

import java.util.ArrayList;

import java.util.List;

public class playList {
    String Name;
    List<Song> playList;

    public playList(String Name) {
        this.Name = Name;
        this.playList = new ArrayList<>();

    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public List<Song> getPlayList() {
        return this.playList;
    }

    public void setPlayList(List<Song> playList) {
        this.playList = playList;
    }

}
