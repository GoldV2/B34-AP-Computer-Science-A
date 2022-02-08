import java.util.ArrayList;;

public class Album {
    
    public String name;
    public Artist artist;
    public ArrayList<Song> songs = new ArrayList<Song>();
    public ReleaseDate releaseDate;

    public Album(String name, Artist artist, ReleaseDate releaseDate) {
        this.name = name;
        this.artist = artist;
        this.releaseDate = releaseDate;
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public int getSongCount() {
        return songs.size();
    }

    public String toString() {
        String str = this.name+"\nSongs:";
        for (Song song : this.songs) {
            str += "\n\t"+song.name;
        }

        return str;
    }

}
