package Priority;
import Tasks.Task;
import java.util.*;

public class ListTask<T> extends ArrayList<T> {

    List<Task> tasks;

    public ListTask() {
        tasks = new ArrayList<>();
    }
    public void addTask(Task task) {
        tasks.add(task);
    }


    public void PrintAllTask() {
        System.out.println("in print" + tasks.size());
        for (Task task: tasks) {
            System.out.println(task);
        }

    }
    public void PrintLowPriorityTask() {
        for (Task task: tasks) {
            if (task.getPriority() == Priority.LOW) {
                System.out.println(task);
            }
        }
    }
    public void PrintMiddlePriorityTask() {
        for (Task task: tasks) {
            if (task.getPriority() == Priority.MIDDLE) {
                System.out.println(task);
            }
        }
    }
    public void PrintHightPriorityTask() {
        for (Task task: tasks) {
            if (task.getPriority() == Priority.HIGH) {
                System.out.println(task);
            }
        }
    }


    public Task getTask(int id) {
        for (Task task: tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }


}



