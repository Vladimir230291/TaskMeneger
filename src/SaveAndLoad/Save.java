package SaveAndLoad;
import Tasks.*;



import java.io.FileWriter;
import java.io.IOException;




public class Save{

    public void saveTask(ListTask<Task> taskList) throws IOException {
        System.out.println("saveTask" + taskList.getTasks().size());
        try (FileWriter fr = new FileWriter("src/SaveAndLoad/save.txt")) {
            for (Task task : taskList.getTasks()) {
                fr.write(task.toSave());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}





