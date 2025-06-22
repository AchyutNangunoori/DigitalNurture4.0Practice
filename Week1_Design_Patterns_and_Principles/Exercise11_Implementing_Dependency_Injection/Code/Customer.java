public class Customer
{
    String name;
    int id;
    
    public Customer(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
}