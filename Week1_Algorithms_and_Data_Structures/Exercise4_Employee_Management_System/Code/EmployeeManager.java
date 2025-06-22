public class EmployeeManager 
{
    private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) 
    {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee emp) 
    {
        if (size >= employees.length) 
        {
            System.out.println("Cannot add more employees. Array is full.");
            return;
        }
        employees[size++] = emp;
        System.out.println("Employee added: " + emp.name);
    }

    public void displayEmployees() 
    {
        if (size == 0) 
        {
            System.out.println("No employees to display.");
            return;
        }
        System.out.println("Employee Records:");
        for (int i = 0; i < size; i++) 
        {
            System.out.println(employees[i]);
        }
    }

    public void searchEmployee(int id) 
    {
        for (int i = 0; i < size; i++) 
        {
            if (employees[i].employeeId == id) 
            {
                System.out.println("Employee Found:\n" + employees[i]);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    public void deleteEmployee(int id) 
    {
        for (int i = 0; i < size; i++) 
        {
            if (employees[i].employeeId == id) 
            {
                for (int j = i; j < size - 1; j++) 
                {
                    employees[j] = employees[j + 1];
                }
                employees[size - 1] = null;
                size--;
                System.out.println("Employee with ID " + id + " deleted.");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }
}
