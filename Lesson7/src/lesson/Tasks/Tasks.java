package lesson.Tasks;

import lesson.Filter.Filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Tasks {
    List<Task> tasks = new ArrayList<>();

    public Tasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Tasks() {
    }

    public void add(Task task) {
        tasks.add(task);
    }
    public void sort(Comparator<Task> comparator) {
        Collections.sort(tasks, comparator);
    }
    public Tasks filter(Predicate<Task> predicate) {
        return new Tasks(Filter.filter(tasks, predicate));
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "tasks=" + tasks +
                '}';
    }
}
