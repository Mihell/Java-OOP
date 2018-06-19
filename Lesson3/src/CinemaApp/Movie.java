package CinemaApp;

public class Movie {
    private String title;
    private int year;
    private int duration;
    private String annotation;

    public Movie(String title, int year, int duration, String annotation) {
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.annotation = annotation;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getDuration() {
        return duration;
    }

    public String getAnnotation() {
        return annotation;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", duration=" + duration +
                ", annotation='" + annotation + '\'' +
                '}';
    }
}
