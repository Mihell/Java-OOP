package lesson.Tasks;

import java.time.LocalDateTime;

public class TasksRunner {
    public static void main(String[] args) {
        Task a = new Task(1, "buy", "buy products", LocalDateTime.of(2018, 07, 26, 12, 30), Priority.MINOR);
        Task b = new Task(2, "code", "write a program", LocalDateTime.of(2018, 07, 23, 12, 30), Priority.MAJOR);
        Task c = new Task(3, "rest", "drink a beer", LocalDateTime.of(2018, 07, 27, 18, 50), Priority.NORMAL);
        Task d = new Task(4, "bank", "visit bank", LocalDateTime.of(2018, 07, 22, 12, 30), Priority.MINOR);

        Tasks tasks = new Tasks();
        tasks.add(a);
        tasks.add(b);
        tasks.add(c);
        tasks.add(d);
        System.out.println(tasks.filter(TaskPredicates.hasExpiredDeadline()));
        System.out.println(tasks.filter(TaskPredicates.hasPriority(Priority.MINOR)));
        tasks.sort(TaskComparators.byName());
        System.out.println(tasks);
        tasks.sort(TaskComparators.byPriority());
        System.out.println(tasks);

    }
}
