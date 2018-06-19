package MusicApp;

import java.util.ArrayList;
import java.util.List;

public class Playlist{
    private String title;
    private List<Song> songs = new ArrayList<>();

    public Playlist(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addSong(Song song){
        songs.add(song);
    }

    public long getTotalLength(){
        long totalLength = 0;
        for(Song song : songs){
            totalLength += song.getLength();
        }
        return totalLength;
    }

    public ArrayList<Song> findByAuthor(String author){
        ArrayList<Song> result = new ArrayList<>();
        for(Song song : songs){
            if(song.getAuthor().equals(author)){
                result.add(song);
            }
        }
        return result;
    }

    public ArrayList<Song> findByTitlePart(String titlePart){
        ArrayList<Song> result = new ArrayList<>();
        for(Song song : songs){
            if(song.getTitle().contains(titlePart)){
                result.add(song);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "title='" + title + '\'' +
                ", songs=" + songs +
                '}';
    }
}
