package MusicApp;

public class Song {
    private String title;
    private String author;
    private String genre;
    private double length;
    private AudioContent content;

    public Song(String title, String author, String genre, double length, AudioContent content) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.length = length;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public double getLength() {
        return length;
    }

    public AudioContent getContent() {
        return content;
    }

    @Override
    public String toString() {
        return '\n' + "Song{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", length=" + length +
                '}';
    }
}

