package MusicApp;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Playlist> playlists = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Playlist createPlaylist(String title){
        playlists.add(new Playlist(title));
        return playlists.get(playlists.size() - 1);
    }

    public Playlist findByTitle(String title){
        for(Playlist playlist : playlists){
            if(playlist.getTitle().equals(title)){
                return playlist;
            }
        }
        System.out.println("Playlist not found!");
        return null;
    }

    public void addSongToPlaylist(String playlistTitle, Song song){
        findByTitle(playlistTitle).addSong(song);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", playlists=" + playlists +
                '}';
    }
}
