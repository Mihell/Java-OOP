import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;
import static java.time.temporal.ChronoUnit.*;

public class DaysFromBirthDateCalculator {
    public static void main (String[] args) throws java.lang.Exception
    {
        String date = "1985-01-26";
        System.out.println(daysFromBirthDate(date));
    }

    public static long daysFromBirthDate(String birthDateString) {
        LocalDate birdth = LocalDate.parse(birthDateString);
        return DAYS.between(birdth, LocalDate.now());
    }
}
