
package model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

public class PersonalizedLibraries extends Libraries {

    private final PrincipalLibrary PL ;
    private Map<String, LinkedList<Song>> reproductionList = new HashMap<>();

    public PersonalizedLibraries(PrincipalLibrary PL) {
        this.PL = PL;
    }

    public Map<String, LinkedList<Song>> getReproductionList() {
        return reproductionList;
    }

    public void setReproductionList(Map<String, LinkedList<Song>> reproductionList) {
        this.reproductionList = reproductionList;
    }

    @Override
    public void createSongList(String title, String reproductionTitle) {
            for (Song song: PL.getAllSongs()) {
                if (!reproductionList.containsKey(reproductionTitle) || !Objects.equals(title, song.getTitle())) {
                    reproductionList.put(reproductionTitle, new LinkedList<>());
                }
                reproductionList.get(reproductionTitle).add(song);
            }
    }

    @Override
    public LinkedList<Song> getPlayList(String title){
        if (reproductionList.containsKey(title)){
            return reproductionList.get(title);
        }else{
            throw new IllegalArgumentException("The reproduction list doesn't exist");
        }
    }
}
