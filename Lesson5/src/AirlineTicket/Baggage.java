package AirlineTicket;

public class Baggage {
    private int bagPrice;
    private int bagAmount;

    public Baggage() {
    }

    public Baggage(int bagPrice, int bagAmount) {
        this.bagPrice = bagPrice;
        this.bagAmount = bagAmount;
    }

    public int priceCount(){
        return bagAmount * bagPrice;
    }

    @Override
    public String toString() {
        return "Baggage{" +
                "bagPrice=" + bagPrice +
                ", bagAmount=" + bagAmount +
                '}';
    }
}
