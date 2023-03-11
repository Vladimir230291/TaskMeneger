package SaveAndLoad;
import Priority.*;
import Tasks.*;


import java.io.FileWriter;
import java.io.IOException;

public class Save {
    FileWriter writer;
    public Save() throws IOException {
        writer = new FileWriter("src/SaveAndLoad/Save.csv");
    }
    public void save(ListTask<Task> taskList) throws IOException {
        for (Task task : taskList)
            writer.write(String.format("%d, %s, %s, %s, %s, %s\n",
                    task.getId(), task.getDate(), task.getDeadline(),
                    task.getAuthor(), task.getTask(), task.getPriority()));



    }
}

