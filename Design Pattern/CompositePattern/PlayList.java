package CompositePattern;

import java.util.ArrayList;

public class PlayList implements IComponent {

    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList<>();

    public PlayList(String playlistName) {
        this.playlistName = playlistName;
    }

    @Override
    public void play() {
        for (IComponent song : this.playlist) {
            song.play();
        }
    }

    @Override
    public void setPlayBackSpeed(float speed) {
        for (IComponent song : this.playlist) {
            song.setPlayBackSpeed(speed);
        }
    }

    @Override
    public String getName() {
        return this.playlistName;
    }

    public void add(IComponent song) {
        playlist.add(song);
    }

    public void remove(IComponent song) {
        playlist.remove(song);
    }

}