package music.spotify.models;

/**
 * Created by jorge on 13-Jan-16.
 */
public class Song {

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }

    private String songName;
    private String songArtist;
    private int stars;
}
