package lesson.Max;

import java.time.LocalDate;
import java.util.Comparator;

public class DayInYearComparator implements Comparator<LocalDate> {
    @Override
    public int compare(LocalDate o1, LocalDate o2) {
        return o1.getDayOfYear() - o2.getDayOfYear();
    }
}
