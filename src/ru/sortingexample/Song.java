package ru.sortingexample;

public class Song implements Comparable <Song> {

    private String title;
    private String artist;
    private String rating;
    private String bmp;

    @Override
    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }

    Song(String t, String a, String r, String b) {
        this.title = t;
        this.artist = a;
        this.rating = r;
        this.bmp = b;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBmp() {
        return bmp;
    }

    public String toString() {
        return title;
    }
}
