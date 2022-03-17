package model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public abstract class Libraries {
    final PrincipalLibrary PL = null;
    Map<String, LinkedList<Song>> reproductionList = new HashMap<>();


    void createSongList(){

    }

    void createSongList(String title, String reproductionTitle){
        
    }

    abstract LinkedList<Song> getPlayList(String title);
}
