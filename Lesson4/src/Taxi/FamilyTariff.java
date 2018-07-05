package Taxi;

public class FamilyTariff implements Tariff {
    @Override
    public long calculatePrice(Ride ride){
        long result = 50 + 20 * ride.getDistance() / ride.getPassengers();
        return result;
    }
    @Override
    public String toString() {
        return "Family tariff";
    }
}
