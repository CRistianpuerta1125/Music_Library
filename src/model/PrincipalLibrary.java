package model;

import java.util.*;
import java.util.stream.Collectors;

public class PrincipalLibrary {
    private List<Song> allSongs = new ArrayList<>();

    public List<Song> getAllSongs() {
        return allSongs;
    }

    public void addSongToAllSongs(Song song){
        allSongs.add(song);
    }

    public void deleteSongToAllSongs(Song song){
        allSongs.remove(song);
    }
    
    public Song getSong(Song song){
        if (allSongs.contains(song)){
            return allSongs.get(allSongs.indexOf(song));
        }else {
            throw new IllegalArgumentException("Song doesn't exist");
        }
    }

    public LinkedList<Song> filterByGender(String gender){
        return allSongs.stream().filter(x -> Objects.equals(x.getGender(), gender)).collect(Collectors.toCollection(LinkedList::new));
    }

    public LinkedList<Song> filterByDate(int year){
        return allSongs.stream().filter(x -> (x.getDate().get(Calendar.YEAR) == year)).collect(Collectors.toCollection(LinkedList::new));
    }
}