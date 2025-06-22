public class Product 
{
    private int productID;
    private String productName;
    private int quantity;
    private double price;

    public Product(int productID, String productName, int quantity, double price) 
    {
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductID() 
    { 
        return productID; 
        
    }
    
    public String getProductName() 
    { 
        return productName; 
        
    }
    
    public int getQuantity() 
    { 
        return quantity; 
    }
    
    public double getPrice() 
    { 
        return price; 
    }

    public void setQuantity(int qty) 
    { 
        this.quantity = qty;
    }
    
    public void setPrice(double pr) 
    { 
        this.price = pr; 
    }

    public String toString() 
    {
        return "Product ID: " + productID +
               "\tProduct Name: " + productName +
               "\tQuantity: " + quantity +
               "\tPrice: " + price;
    }
}