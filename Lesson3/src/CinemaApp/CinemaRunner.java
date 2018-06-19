/*
Смоделировать покупку билетов на один сеанс в кинотеатр. Нарисовать UML диаграмму и написать классы.
        Основные сущности:
        Movie (фильм): фильм содержит название, год выпуска, длительность, описание.
        HallForSession (зал кинотеатра для одного сеанса): зал состоит из мест (количество рядов и мест в ряде задается в конструкторе); место имеет 2 состояния: свободное, забронированное; объект должен предоставлять функционал бронирования места и должен подсчитывать количество купленных и свободных мест.
        MovieSession (сеанс): сеанс содержит фильм, зал для сеанса, цену билета, время начала; объект должен уметь подсчитывать итоговые сборы по сеансу.
        Клиентский класс CinemaRunner, демонстрирующий работу предыдущих классов.
*/

package CinemaApp;

public class CinemaRunner {
    public static void main(String[] args) {
        Movie avatar = new Movie("Avatar", 2009, 162, "fantasy");
        Movie avangers = new Movie("Avengers", 2012, 150, "Marvel film");
        HallForSession hallForSession = new HallForSession(15, 20);
        MovieSession session = new MovieSession(avatar, hallForSession, 100, "19:30");
        hallForSession.setSession(session);
        hallForSession.bookSeat(1,10);
        hallForSession.bookSeat(1,11);
        hallForSession.bookSeat(2,15);
        hallForSession.bookSeat(2,14);
        hallForSession.bookSeat(2,14);
        System.out.println("Total fee is " + session.getTotalFees());
    }
}

/*
output:
        You have booked the seat # 10 in row 1
        You have booked the seat # 11 in row 1
        You have booked the seat # 15 in row 2
        You have booked the seat # 14 in row 2
        This seat is reserved, try another
        Total fee is 400

        Process finished with exit code 0*/
