package CompositePattern;

import java.util.ArrayList;
import java.util.List;


//Composite
public class TaskList implements Task {

    private String title;
    private List<Task> tasks;


    public TaskList(String title)
    {
        this.title = title;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task)
    {
        this.tasks.add(task);
    }

    public void removeTask(Task task)
    {
        this.tasks.remove(task);
    }

    @Override
    public String getTitle() {
        return this.title;
        
    }

    @Override
    public void setTitle(String title) {
       this.title = title;
    }

    @Override
    public void display() {
        System.out.println(this.title);
        System.out.println("Child Tasks");
        for(Task task: this.tasks)
        {
           task.display();
        }
    }
    
}
