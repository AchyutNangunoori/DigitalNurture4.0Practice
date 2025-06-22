public class SearchOperation 
{
    boolean found;

    public void linearSearch(int id, Product products[]) 
    {
        found = false;
        
        for (Product p : products) 
        {
            if (p.getID() == id) 
            {
                found = true;
                System.out.println("Found the product with ID: " + id);
                System.out.println(p);
                break;
            }
        }
        
        if(!found) 
        {
            System.out.println("No product with ID: " + id);
        }
    }

    public void binarySearch(int id, Product products[]) 
    {
        found = false;
        int left = 0;
        int right = products.length - 1;
        int mid;

        while (left <= right) 
        {
            mid = (left + right) / 2;
            if (products[mid].getID() == id) 
            {
                found = true;
                System.out.println("Product found with ID: " + id);
                System.out.println(products[mid]);
                break;
            }
            if (products[mid].getID() > id) 
            {
                right = mid - 1;
            } 
            else 
            {
                left = mid + 1;
            }
        }

        if (!found) 
        {
            System.out.println("No product with ID: " + id);
        }
    }
}
