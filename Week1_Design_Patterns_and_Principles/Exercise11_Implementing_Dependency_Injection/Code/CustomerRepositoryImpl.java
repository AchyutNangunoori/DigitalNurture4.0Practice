import java.util.*;

public class CustomerRepositoryImpl implements CustomerRepository
{
    Map<Integer,String> customerList = new HashMap<Integer,String>();
    
    public boolean findCustomerById(int id)
    {
        if(customerList.containsKey(id))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void addCustomer(Customer customer)
    {
        customerList.put(customer.getId(),customer.getName());
        System.out.println("Customer added with ID: " + customer.getId());
    }
}