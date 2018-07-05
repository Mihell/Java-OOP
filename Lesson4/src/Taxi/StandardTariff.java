package Taxi;

public class StandardTariff implements Tariff {
    @Override
    public long calculatePrice(Ride ride){
        long result = 30 + 5 * ride.getDistance() + 2 * ride.getDuration();
        return result;
    }
    @Override
    public String toString() {
        return "Standart tariff";
    }
}
