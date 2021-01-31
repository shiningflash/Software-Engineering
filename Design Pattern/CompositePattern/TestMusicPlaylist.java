package CompositePattern;

public class TestMusicPlaylist {
    public static void main(String[] args) {

        PlayList studyPlaylist = new PlayList("Study");

        PlayList synthPopPlaylist = new PlayList("Synth Pop");
        Song synthPopSong1 = new Song("Girl Like You", "Toro Y Moi" );
        Song synthPopSong2 = new Song("Outside", "TOPS");
        float slowSpeed = 0.5f;
        synthPopPlaylist.setPlayBackSpeed(slowSpeed);
        synthPopPlaylist.add(synthPopSong1);
        synthPopPlaylist.add(synthPopSong2);

        studyPlaylist.add(synthPopPlaylist);

        Song glitchSong = new Song("Textuell", "Oval");
        float fasterSpeed = 1.25f;
        glitchSong.setPlayBackSpeed(fasterSpeed);
        glitchSong.play();
        String name = glitchSong.getName();
        String artist = glitchSong.getArtist();
        System.out.println ("The song name is " + name );
        System.out.println ("The song artist is " + artist );

        studyPlaylist.add(glitchSong);

        studyPlaylist.play();

        System.out.println ("The Playlist's name is " + studyPlaylist.getName() );
    }
}
