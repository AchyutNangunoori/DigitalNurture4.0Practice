public class Task 
{
    int taskId;
    String taskName;
    String status;

    public Task(int taskId, String name, String status) 
    {
        this.taskId = taskId;
        this.taskName = name;
        this.status = status;
    }

    public String toString() 
    {
        return "Task ID: " + taskId + 
               "\tName: " + taskName + 
               "\tStatus: " + status;
    }
}
