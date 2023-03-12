package Tasks;
import Priority.Priority;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public abstract class Task {
    private final int id;
    private static int idCounter = 1;
    private String date;
    private String deadline;
    private String author;
    private String task;
    private Priority priority;


    public Task(String task, String deadline, String author, Priority priority) {

        id = idCounter++;
        this.task = task;
        this.deadline = deadline;
        this.author = author;
        this.date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.priority = priority;
    }

    public Task(int id, String date, String deadline, String author, String task, Priority priority) {
        this.id = id;
        this.date = date;
        this.deadline = deadline;
        this.author = author;
        this.task = task;
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }
    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getAuthor() {
        return author;
    }

    public String getTask() {
        return task;
    }
    @Override
    public int hashCode() {
        int result = date != null ? date.hashCode() : 0;
        result = 31 * result + (deadline != null ? deadline.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + task.hashCode();
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public String toString() {
        return String.format("id: %d, Дата добавления записи: %s,\nДедлайн: %s, Автор: %s,\nЗадача: %s\n",
                id, date, deadline, author, task);
    }
    public String toSave() {
        return String.format("%d,%s,%s,%s,%s,%s", id, date, deadline, author, task, priority);
    }

}
