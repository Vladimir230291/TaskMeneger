package Tasks;
import Priority.Priority;

public class LowPriorityTaks extends Task {

    public LowPriorityTaks(String task, String deadline, String name, Priority p) {
        super(task, deadline, name, p);

    }
    public LowPriorityTaks(int id, String date, String deadline, String author, String task, Priority priority) {
        super(id, date, deadline, author, task, priority);
    }
}
