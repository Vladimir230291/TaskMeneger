package SaveAndLoad;

import Priority.*;
import Tasks.*;

import java.io.*;

public class Load {
    public ListTask<Task> loadTask() throws IOException {
        ListTask<Task> taskList = new ListTask<>();
        try (FileReader fr = new FileReader("src/SaveAndLoad/save.txt")) {
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {

                String[] str = line.split(",");
                switch (str[str.length - 1]) {
                    case "LOW":
                        taskList.addTask(new LowPriorityTaks(Integer.parseInt(str[0]), str[1], str[2], str[3], str[4], Priority.LOW));
                        break;
                    case "MIDDLE":
                        taskList.addTask(new MiddlePriorityTask(Integer.parseInt(str[0]), str[1], str[2], str[3], str[4], Priority.MIDDLE));
                        break;
                    case "HIGH":
                        taskList.addTask(new HightPriorityTask(Integer.parseInt(str[0]), str[1], str[2], str[3], str[4], Priority.HIGH));
                        break;
                }
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return taskList;
    }
}
