package CompositePattern;

public class Client {
 
    public static void main(String[] args)
    {
        Task simpleTask1 = new SimpleTask();
        simpleTask1.setTitle("Task 1");
        Task simpleTask2 = new SimpleTask();
        simpleTask2.setTitle("Task 2");
        Task simpleTask3 = new SimpleTask();
        simpleTask3.setTitle("Task 3");

        TaskList parenttask = new TaskList("Parent Task");
        parenttask.addTask(simpleTask1);
        parenttask.addTask(simpleTask2);
        parenttask.display();
        parenttask.removeTask(simpleTask2);
        parenttask.addTask(simpleTask3);
        parenttask.display();
    }
}
