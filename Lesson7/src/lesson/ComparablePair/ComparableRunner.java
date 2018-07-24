package lesson.ComparablePair;


import lesson.Max.Max;

import java.time.LocalDate;

public class ComparableRunner {
    public static void main(String[] args) {
        ComparablePair<String> names = new ComparablePair<>("Alexander", "Bob");
        System.out.println(names.bigger());
        System.out.println(names.smaller());

        ComparablePair<LocalDate> dates = new ComparablePair<>(
                LocalDate.of(1995, 8, 4),
                LocalDate.of(1990, 10, 3)
        );
        System.out.println(dates.bigger());
        System.out.println(dates.smaller());


    }
}
