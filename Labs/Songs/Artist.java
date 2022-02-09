import java.util.ArrayList;

public class Artist {
    
    public String name;
    public ArrayList<Album> albums = new ArrayList<Album>();

    public Artist(String name) {
        this.name = name;
    }

    public void createAlbum(String name, ReleaseDate releaseDate) {
        Album album = new Album(name, this, releaseDate);
        this.albums.add(album);
    }

    public void createSong(String name, int albumN, double price, int rating) {
        Album album = this.albums.get(albumN);
        Song song = new Song(this, name, album, price, rating);
        album.songs.add(song);
    }

    public void albumMenu() {
        for (int i = 1; i <= this.albums.size(); i++) {
            Album album = this.albums.get(i-1);
            Main.print("("+i+") "+album.name);
        }
    }

    public String toString() {
        String str = "\nAlbums:";
        for (Album album : this.albums) {
            String albumStr = "\n"+album.name+"\n\tSongs:";
            for (Song song : album.songs) {
                albumStr += "\n\t"+song.name+"\n\t\tPrice: "+song.price+" | Rating: "+song.rating;
            }
            str += albumStr;
        }
        return str;
    }

}
