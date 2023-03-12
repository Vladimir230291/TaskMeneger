package SaveAndLoad;
import Priority.*;
import Tasks.*;



import java.io.FileWriter;
import java.io.IOException;


public class Save{

    public void saveTask(ListTask<Task> taskList) throws IOException {
        System.out.println("saveTask" + taskList.size());
        try (FileWriter fr = new FileWriter("src/SaveAndLoad/save.txt")) {
            for (Task task : taskList) {
                fr.write(task.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





