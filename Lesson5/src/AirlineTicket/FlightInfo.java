package AirlineTicket;

public class FlightInfo {
    private int flightNumber;
    private String departurePlace;
    private String arrivalPlace;
    private String departureTime;
    private int seatNumber;
    private int price;

    public FlightInfo() {
    }

    public FlightInfo(int flightNumber, String departurePlace, String arrivalPlace, String departureTime, int seatNumber, int price) {
        this.flightNumber = flightNumber;
        this.departurePlace = departurePlace;
        this.arrivalPlace = arrivalPlace;
        this.departureTime = departureTime;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    public void setArrivalPlace(String arrivalPlace) {
        this.arrivalPlace = arrivalPlace;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {

        return price;
    }

    @Override
    public String toString() {
        return "FlightInfo{" +
                "flightNumber=" + flightNumber +
                ", departurePlace='" + departurePlace + '\'' +
                ", arrivalPlace='" + arrivalPlace + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", seatNumber=" + seatNumber +
                ", price=" + price +
                '}';
    }
}
