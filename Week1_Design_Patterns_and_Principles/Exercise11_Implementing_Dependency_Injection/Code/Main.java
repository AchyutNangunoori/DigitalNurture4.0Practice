public class Main
{
    public static void main(String[] args)
    {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        CustomerService customerService = new CustomerService(customerRepository);
        
        Customer customer = new Customer(1, "Customer1");
        System.out.println("Customer is Created with ID 1\b");
        
        customerService.addCustomer(customer);
        
        System.out.println("\nCheck if a customer with ID 1 is present");
        customerService.checkCustomerById(1);
        
        System.out.println("\nCheck if a customer with ID 2 is present");
        customerService.checkCustomerById(2);
    }
}