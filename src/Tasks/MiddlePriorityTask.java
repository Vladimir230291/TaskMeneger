package Tasks;
import Priority.Priority;

public class MiddlePriorityTask extends Task {

    public MiddlePriorityTask(String task, String deadline, String name, Priority p) {
        super(task, deadline, name, p);
    }
    public MiddlePriorityTask(int id, String date, String deadline, String author, String task, Priority priority) {
        super(id, date, deadline, author, task, priority);
    }
}



