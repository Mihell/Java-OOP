package AirlineTicket;

public class TicketRunner {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(03,
                new PassengerInfo("Mickle", "Jackson", 123456),
                new FlightInfo(007, "Kiev", "Miamy", "14:30", 5, 120));
        VipTicket vip = new VipTicket(01,
                new PassengerInfo("Grisha", "Petrovich", 111111),
                new FlightInfo(001, "Kiev", "Tsurupinsk", "23:30", 2, 1200),
                new Baggage(2, 50),
                new Meal("Meat", true, 100));
        System.out.println(ticket);
        System.out.println(vip);
        System.out.println("Price of simple ticket is " + ticket.priceCount());
        System.out.println("Price of vip ticket is " + vip.priceCount());
    }
}
