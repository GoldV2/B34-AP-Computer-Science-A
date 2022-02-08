public class Song {
    
    public Artist artist;
    public String name;
    public Album album;
    public ReleaseDate releaseDate;
    public double price;
    public int rating;

    public Song(Artist artist, String name, Album album, double price, int rating) {
        this.artist = artist;
        this.name = name;
        this.album = album;
        this.price = price;
        this.rating = rating;
        
        this.releaseDate = album.releaseDate;
    }

    public String toString() {
        String str = "\nName: "+this.name+" | Price: "+this.price+" | Rating: "+this.rating;
        return str;
    }
}
