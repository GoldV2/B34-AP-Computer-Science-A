import java.lang.Math;
import java.util.ArrayList;

public class Population {
    
    public String[] names = {"Ye", "Eminem", "Drake", "Rihanna", "Talyor Swift"};
    private double[] prices = {0.99, 1.99, 2.99};
    private int maxSongs = 5;
    private int maxAlbums = 2;
    private int minRating = 1;
    private int maxRating = 10;

    public ArrayList<Artist> artists = new ArrayList<Artist>();

    public Population() {
        
    }

    public void createSong() {
        if (this.artists.size() > 0) {
            this.artistMenu();
            int artistN = Main.intInput("Arist number");
            Artist artist = this.artists.get(artistN-1);
            if (artist.albums.size() > 0) {
                artist.albumMenu();
                int albumN = Main.intInput("Album number");
                String name = Main.strInput("Song name");
                double price = Main.doubleInput("Song price");
                int rating = Main.intInput("Song rating");
                artist.createSong(name, albumN-1, price, rating);
            }
            
            else {
                Main.print("You need to create an album first");
            }
        }

        else {
            Main.print("You need to create an artist first");
        }
    }

    public void createAlbum() {
        if (this.artists.size() > 0) {
            this.artistMenu();
            int artistN = Main.intInput("Artist number");
            
            String name = Main.strInput("Album name");
            int year = Main.intInput("Album release date year");
            int month = Main.intInput("Album release date month");
            int day = Main.intInput("Album release date day");
            
            this.artists.get(artistN-1).createAlbum(name,
                new ReleaseDate(year, month, day));
        }

        else {
            Main.print("You need to create an artist first");
        }
    }

    public void creatArtist() {
        String name = Main.strInput("Artist name");
        this.artists.add(new Artist(name));
        Main.print(name+" created successfully!");
    }

    public void artistMenu() {
        for (int i = 1; i <= this.artists.size(); i++) {
            Main.print("("+i+") "+this.artists.get(i-1).name);
        }
    }

    public ArrayList<Song> getSongs() {
        ArrayList<Song> songs = new ArrayList<Song>();
        for (Artist artist : this.artists) {
            for (Album album : artist.albums) {
                for (Song song : album.songs) {
                    songs.add(song);
                }
            }
        }

        return songs;
    }

    public void sortSongs(int sortBy, int orderBy, ArrayList<Song> songs) {
        int n = songs.size();
        for (int i=0; i < n-1; i++) {
            for (int j=0; j < n-i-1; j++) {
                boolean sorted = false;
                if (sortBy == 1) {
                    if (songs.get(j).rating > songs.get(j+1).rating) {
                        sorted = true;
                    }
                }

                else if (sortBy == 2) {
                    if (songs.get(j).price > songs.get(j+1).price) {
                        sorted = true;
                    }
                }

                if (sorted) {
                    songs.add(j, songs.get(j+1));
                    songs.remove(j+2);
                }
            }

        }

        if (orderBy == 2) {
            reverseSongs(songs);
        }
    }

    public void reverseSongs(ArrayList<Song> songs) {
        for (int i = 0; i < songs.size() / 2; i++) {
            Song temp = songs.get(i);
            songs.set(i, songs.get(songs.size() - i - 1));
            songs.set(songs.size() - i - 1, temp);
        }
    }

    public void autoPopulate() {
        for (String name : this.names) {
            Artist artist = new Artist(name);
            for (int albumN = 1; albumN <= this.maxAlbums; albumN++) {
                artist.createAlbum(
                    "Album #"+albumN,
                    new ReleaseDate(
                        randInt(2015, 2022),
                        randInt(1, 12),
                        randInt(1, 29)
                        )
                    );
                
                for (int songN = 1; songN <= this.maxSongs; songN++) {
                    artist.createSong(
                        name+" Song #"+(songN+(5*(albumN-1))),
                        albumN-1,
                        prices[randInt(0, prices.length-1)],
                        randInt(this.minRating, this.maxRating)
                        );
                }
            }

            this.artists.add(artist);
        }
    }

    public int randInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}
