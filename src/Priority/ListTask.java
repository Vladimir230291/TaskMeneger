package Priority;
import Tasks.Task;
import java.util.*;

public class ListTask<T extends Task> {

    List<Task> tasks;
    int size;
    public ListTask() {
        tasks = new ArrayList<>();
    }
    public void addTask(Task task) {
        tasks.add(task);
    }
    public void removeTask(int id) {
        size = tasks.size();
        for (Task task: tasks){
            if (task.getId() == id) {
                tasks.remove(task);
                break;
            }

        }
    }
    public void PrintAllTask() {
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

}


