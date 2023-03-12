import Priority.*;
import SaveAndLoad.Save;
import Tasks.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

       Task task = new LowPriorityTaks("Задача с низким приоритетом",
               "2022-01-01", "Алексей", Priority.LOW);
       Task task1 = new MiddlePriorityTask("Задача с средним приоритетом",
               "2022-01-01", "Иван",Priority.MIDDLE);
       Task task2 = new HightPriorityTask("Задача с высоким приоритетом",
               "2022-01-01", "Сергей",Priority.HIGH);
       ListTask<Task> taskList = new ListTask<Task>();
       taskList.addTask(task);
       taskList.addTask(task1);
       taskList.addTask(task2);
       System.out.println("after add" + taskList.size());

       Save save = new Save(taskList);

       save.saveTask();






    }
}