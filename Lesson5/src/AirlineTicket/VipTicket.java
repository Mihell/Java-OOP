package AirlineTicket;

public class VipTicket extends Ticket {
    private Baggage baggage;
    private Meal meal;

    public VipTicket(Baggage baggage, Meal meal) {
        super();
    }

    public VipTicket(int number, PassengerInfo passengerInfo, FlightInfo flightInfo, Baggage baggage, Meal meal) {
        super(number, passengerInfo, flightInfo);
        this.baggage = baggage;
        this.meal = meal;
    }

    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public int priceCount(){
        return super.priceCount() + baggage.priceCount() + meal.getPrice();

    }

    @Override
    public String toString() {
        return "VipTicket{" +
                super.toString() + 
                "baggage=" + baggage +
                ", meal=" + meal +
                '}';
    }
}
