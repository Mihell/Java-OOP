package lesson.Max;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class MaxRunner {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob", "Alexander", "Sophia", "Zoe");
        String longestName = Max.max(names, new LengthComparator());
        System.out.println(longestName);

        List<LocalDate> birthDays = Arrays.asList(
                LocalDate.of(1995, 8, 4),
                LocalDate.of(1986, 3, 15),
                LocalDate.of(1990, 10, 3),
                LocalDate.of(1990, 2, 26)
        );
        LocalDate latestBirthDayInYear = Max.max(birthDays, new DayInYearComparator());
        System.out.println(latestBirthDayInYear);

    }
}
