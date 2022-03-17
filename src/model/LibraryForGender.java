package model;

import java.util.*;

public class LibraryForGender extends Libraries {
    private final PrincipalLibrary PL;
    private Map<String, LinkedList<Song>> reproductionList;

    public LibraryForGender(PrincipalLibrary PL) {
        this.PL = PL;
        this.reproductionList = new HashMap<>();
    }

    public Map<String, LinkedList<Song>> getReproductionList() {
        return reproductionList;
    }

    public void setReproductionList(Map<String, LinkedList<Song>> reproductionList) {
        this.reproductionList = reproductionList;
    }

    @Override
    public void createSongList(){
        for (Song song: PL.getAllSongs()) {
            if (!reproductionList.containsKey(song.getGender())) {
                reproductionList.put(song.getGender(), new LinkedList<>());
            }
            reproductionList.get(song.getGender()).add(song);
        }
    }

    @Override
    public LinkedList<Song> getPlayList(String gender){
        if (reproductionList.containsKey(gender)){
            return reproductionList.get(gender);
        }else{
            throw new IllegalArgumentException("The gender doesn't exist");
        }
    }
}
