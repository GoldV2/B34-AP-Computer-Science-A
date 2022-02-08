public class ReleaseDate {
    public int year;
    public int month;
    public int day;

    public ReleaseDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return this.month+"/"+this.day+"/"+this.year;
    }
}
