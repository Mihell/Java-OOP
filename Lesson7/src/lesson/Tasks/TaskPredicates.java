package lesson.Tasks;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.function.Predicate;

public class TaskPredicates {
    public static Predicate<Task> nameContains(String substring) {
        return task -> task.getName().contains(substring);
    }

    public static Predicate<Task> hasExpiredDeadline() {
        return task -> (task.getDeadline().compareTo(LocalDateTime.now()) < 0);
    }

    public static Predicate<Task> hasPriority(Priority priority) {
        return task -> task.getPriority() == priority;
    }
}
