package Taxi;

public class TaxiRunner
{
    public static void main (String[] args){
        Ride firstRide = new Ride(1, 20, 30, new StandardTariff());
        System.out.println(firstRide);
        Ride secondRide = new Ride(4, 15, 20, new FamilyTariff());
        System.out.println(secondRide);
        RidesHistory history = new RidesHistory();
        history.addRide(firstRide);
        history.addRide(secondRide);
        System.out.println("Total price of history is " + history.getTotalPrice());
    }
}
