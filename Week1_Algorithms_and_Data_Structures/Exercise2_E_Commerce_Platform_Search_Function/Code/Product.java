public class Product 
{
    private int productID;
    private String productName;
    private String category;

    public Product(int productID, String productName, String category) 
    {
        this.productID = productID;
        this.productName = productName;
        this.category = category;
    }

    public int getID() 
    {
        return productID;
    }

    public String toString() 
    {
        return "Product ID: " + productID + 
               "\tProduct Name: " + productName + 
               "\tCategory: " + category;
    }
}
