package CinemaApp;

public class MovieSession {
    private Movie movie;
    private HallForSession hall;
    private int price;
    private String time;

    public MovieSession(Movie movie, HallForSession hall, int price, String time) {
        this.movie = movie;
        this.hall = hall;
        this.price = price;
        this.time = time;
    }

    public int getTotalFees() {
        return hall.bookedSeatsAmount() * price;
    }

    @Override
    public String toString() {
        return "MovieSession{" +
                "movie=" + movie +
                ", hall=" + hall +
                ", price=" + price +
                ", time='" + time + '\'' +
                '}';
    }
}
