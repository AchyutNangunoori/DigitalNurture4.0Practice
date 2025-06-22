public class Main 
{
    public static void main(String[] args) 
    {
        TaskLinkedList taskLinkedList = new TaskLinkedList();
        
        System.out.println("Displaying all Tasks");
        taskLinkedList.displayTasks();
        
        System.out.println("\nAdding new tasks\n");
        taskLinkedList.addTask(new Task(1, "Design UI", "Pending"));
        taskLinkedList.addTask(new Task(2, "Implement Login", "In Progress"));
        taskLinkedList.addTask(new Task(3, "Setup Database", "Completed"));
        
        System.out.println("\nDisplaying all Tasks");
        taskLinkedList.displayTasks();
        
        System.out.println("\nSearching for a Task with Id 2");
        taskLinkedList.searchTask(2);
        
        System.out.println("\nDeleting a Task with Id 2");
        taskLinkedList.deleteTask(2);
        
        System.out.println("\nDisplaying all Tasks");
        taskLinkedList.displayTasks();
    }
}