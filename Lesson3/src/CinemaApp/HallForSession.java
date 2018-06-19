package CinemaApp;

public class HallForSession {
    private int rows;
    private int seatsInRow;
    private boolean[][] seats; //false - seat is free, true - seat is reserved
    private MovieSession session;

    public HallForSession(int rows, int seatsInRow) {
        this.rows = rows;
        this.seatsInRow = seatsInRow;
        this.seats = new boolean[rows][seatsInRow];
    }

    public void setSession(MovieSession session) {
        this.session = session;
    }

    public int freeSeatsAmount() {
        int freeSeats = 0;
        for(boolean[] row : seats){
            for(boolean seat : row) {
                if(!seat) {
                    freeSeats++;
                }
            }
        }
        return freeSeats;
    }

    public int bookedSeatsAmount() {
        return rows * seatsInRow - freeSeatsAmount();
    }

    public void bookSeat(int row, int seat) {
        if(freeSeatsAmount() == 0){
            System.out.println("Sorry, there are no free tickets");
        }else if(seats[row][seat]) {
            System.out.println("This seat is reserved, try another");
        }else {
            seats[row][seat] = true;
            System.out.println("You have booked the seat # " + seat + " in row " + row);;
        }
    }

    @Override
    public String toString() {
        return "HallForSession{" +
                "rows=" + rows +
                ", seatsInRow=" + seatsInRow +
                ", session=" + session +
                '}';
    }
}
