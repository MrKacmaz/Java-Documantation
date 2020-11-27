package linkedList.mp3;

import java.util.ArrayList;
import java.util.LinkedList;

public class albüm {

    private String songName;
    private int songTime;

    private ArrayList<şarkıBilgisi>songs;

    public albüm(String songName, int songTime) {
        this.songName = songName;
        this.songTime = songTime;
        songs = new ArrayList<>();
    }

     public void addSong(String songNames , int songTimes){
        if (findMusic(songNames) == null) {
            this.songs.add(new şarkıBilgisi(songNames, songTimes));
        }else System.err.println("bu şarkı zaten var");
     }

     public şarkıBilgisi findMusic(String songName){
         for (şarkıBilgisi s:songs) {
             if (s.getAdı().equals(songName)){
                 return s;
             }
         }
         return null;
     }

     public void addSongList(String songName, LinkedList<şarkıBilgisi> linkedList){

        şarkıBilgisi added = findMusic(songName);
        if (added != null){
            linkedList.add(added);
        }

     }

}
