public class Employee 
{
    int employeeId;
    String name;
    String position;
    double salary;

    public Employee(int employeeId, String name, String position, double salary) 
    {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String toString() 
    {
        return "ID: " + employeeId + 
               "\t Name: " + name + 
               "\t Position: " + position + 
               "\t Salary: " + salary;
    }
}
