package AirlineTicket;

public class Ticket {
    private int number;
    private PassengerInfo passengerInfo;
    private FlightInfo flightInfo;

    public Ticket() {
    }

    public Ticket(int number, PassengerInfo passengerInfo, FlightInfo flightInfo) {
        this.number = number;
        this.passengerInfo = passengerInfo;
        this.flightInfo = flightInfo;
    }

    public int priceCount(){
        return flightInfo.getPrice();
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPassengerInfo(PassengerInfo passengerInfo) {
        this.passengerInfo = passengerInfo;
    }

    public void setFlightInfo(FlightInfo flightInfo) {
        this.flightInfo = flightInfo;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number=" + number +
                ", passengerInfo=" + passengerInfo +
                ", flightInfo=" + flightInfo +
                '}';
    }
}
