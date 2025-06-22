public class CustomerService
{
    CustomerRepository customerRepository;
    
    public CustomerService(CustomerRepository customerRepository)
    {
        this.customerRepository = customerRepository;
    }
    
    public void addCustomer(Customer customer)
    {
        customerRepository.addCustomer(customer);
    }
    
    public void checkCustomerById(int id)
    {
        if(customerRepository.findCustomerById(id))
        {
            System.out.println("Customer Found");
        }
        else
        {
            System.out.println("Customer Not Found");
        }
    }
}