package CompositePattern;

public class Song implements IComponent {

    public String songName;
    public String artist;
    public float speed = 1; // default playback speed

    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this.songName + " with speed " + this.speed);
    }

    @Override
    public void setPlayBackSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public String getName() {
        return this.songName;
    }

    public String getArtist() {
        return this.artist;
    }
}
