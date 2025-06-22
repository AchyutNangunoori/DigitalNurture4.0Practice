class Node {
    Task task;
    Node next;

    public Node(Task task) 
    {
        this.task = task;
        this.next = null;
    }
}

public class TaskLinkedList 
{
    private Node head;
    
    public void addTask(Task task) 
    {
        Node newNode = new Node(task);
        if (head == null) 
        {
            head = newNode;
        } 
        else 
        {
            Node current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Task added: " + task.taskName);
    }

    public void displayTasks() 
    {
        if (head == null) 
        {
            System.out.println("No tasks to display.");
            return;
        }
        Node current = head;
        while (current != null) 
        {
            System.out.println(current.task.toString());
            current = current.next;
        }
    }

    public void searchTask(int id) 
    {
        Node current = head;
        while (current != null) 
        {
            if (current.task.taskId == id) 
            {
                System.out.println("Task Found:\n" + current.task);
                return;
            }
            current = current.next;
        }
        System.out.println("Task with ID " + id + " not found.");
    }

    public void deleteTask(int id) 
    {
        if (head == null) 
        {
            System.out.println("No tasks to delete.");
            return;
        }

        if (head.task.taskId == id) 
        {
            head = head.next;
            System.out.println("Task with ID " + id + " deleted.");
            return;
        }

        Node current = head;
        while (current.next != null && current.next.task.taskId != id) 
        {
            current = current.next;
        }

        if (current.next == null) 
        {
            System.out.println("Task with ID " + id + " not found.");
        } 
        else 
        {
            current.next = current.next.next;
            System.out.println("Task with ID " + id + " deleted.");
        }
    }
}
