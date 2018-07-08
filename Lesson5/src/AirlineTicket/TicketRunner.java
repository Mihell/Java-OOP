package AirlineTicket;

/*
Смоделировать авибилеты 2 типов: стандартный авиабилет и vip-авиабилет, который расширяет функционал стандартного добавлением платных сервисов (багаж и еда).
*/

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

/*out:
Ticket{number=3, passengerInfo=PassengerInfo{name='Mickle', surname='Jackson', passportNumber=123456}, flightInfo=FlightInfo{flightNumber=7, departurePlace='Kiev', arrivalPlace='Miamy', departureTime='14:30', seatNumber=5, price=120}}
VipTicket{Ticket{number=1, passengerInfo=PassengerInfo{name='Grisha', surname='Petrovich', passportNumber=111111}, flightInfo=FlightInfo{flightNumber=1, departurePlace='Kiev', arrivalPlace='Tsurupinsk', departureTime='23:30', seatNumber=2, price=1200}}baggage=Baggage{bagPrice=2, bagAmount=50}, meal=Meal{foodType='Meat', isDrink=true, price=100}}
Price of simple ticket is 120
Price of vip ticket is 1400
*/
