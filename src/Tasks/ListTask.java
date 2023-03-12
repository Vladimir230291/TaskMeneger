package Tasks;
import Priority.Priority;
import Tasks.Task;
import java.util.*;

public class ListTask<T extends Task> {

    private List<Task> tasks;

    public ListTask() {
        tasks = new ArrayList<>();
    }
    public void addTask(Task task) {
        tasks.add(task);
    }

    public void printAllTask() {
        System.out.println("in print" + tasks.size());
        for (Task task: tasks) {
            System.out.println(task);
        }

    }
    public void printLowPriorityTask() {
        for (Task task: tasks) {
            if (task.getPriority() == Priority.LOW) {
                System.out.println(task);
            }
        }
    }
    public void printMiddlePriorityTask() {
        for (Task task: tasks) {
            if (task.getPriority() == Priority.MIDDLE) {
                System.out.println(task);
            }
        }
    }
    public void printHightPriorityTask() {
        for (Task task: tasks) {
            if (task.getPriority() == Priority.HIGH) {
                System.out.println(task);
            }
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }



}



