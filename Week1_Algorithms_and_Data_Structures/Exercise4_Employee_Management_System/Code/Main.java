public class Main {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager(5);
        
        System.out.println("Adding new Employees into Array");
        employeeManager.addEmployee(new Employee(101, "Alice", "Developer", 75000));
        employeeManager.addEmployee(new Employee(102, "Bob", "Manager", 88000));
        employeeManager.addEmployee(new Employee(103, "Carol", "Designer", 64000));
        
        System.out.println("\nShowing all employees");
        employeeManager.displayEmployees();
        
        System.out.println("\nSearching for Employee ID 102");
        employeeManager.searchEmployee(102);
        
        System.out.println("\nDeleting Employee ID 102");
        employeeManager.deleteEmployee(102);
        
        System.out.println("\nShowing all employees");
        employeeManager.displayEmployees();
    }
}