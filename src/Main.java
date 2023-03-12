import SaveAndLoad.Load;
import SaveAndLoad.Save;
import Tasks.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       ListTask<Task> taskList = new ListTask();
       Save save = new Save();
       Load load = new Load();
//       Task task = new LowPriorityTaks("Задача с низким приоритетом",
//               "2022-11-01", "Алексей", Priority.LOW);
//       Task task1 = new MiddlePriorityTask("Задача с средним приоритетом",
//               "2022-08-01", "Иван", Priority.MIDDLE);
//       Task task2 = new HightPriorityTask("Задача с высоким приоритетом",
//               "2022-05-01", "Сергей", Priority.HIGH);

       taskList = load.loadTask();

       taskList.printAllTask();








    }
}