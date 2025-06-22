public interface CustomerRepository
{
    public boolean findCustomerById(int id);
    public void addCustomer(Customer customer);
}