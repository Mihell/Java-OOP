package lesson.Tasks;

import java.time.LocalDateTime;

public class Task {
    private final long id;
    private final String name;
    private final String description;
    private final LocalDateTime deadline;
    private final Priority priority;

    public Task(long id, String name, String description, LocalDateTime deadline, Priority priority) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", priority=" + priority +
                '}';
    }
}
