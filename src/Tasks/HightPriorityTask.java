package Tasks;
import Priority.Priority;

public class HightPriorityTask extends Task {
    public HightPriorityTask(String task, String deadline, String name, Priority p) {
        super(task, deadline, name, p);
    }
    public HightPriorityTask(int id, String date, String deadline, String author, String task, Priority priority) {
        super(id, date, deadline, author, task, priority);
    }
}
