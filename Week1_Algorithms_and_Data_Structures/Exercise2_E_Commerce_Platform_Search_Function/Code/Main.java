public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Creating an E-Commerce platform");
        SearchOperation searchOperation = new SearchOperation();

        System.out.println("\nCreating an unsorted array of products for linear search");
        Product[] arr1 = {
            new Product(21, "Book", "Education"),
            new Product(14, "Desk Lamp", "Home Decor"),
            new Product(19, "Soccer Ball", "Sports"),
            new Product(12, "Tablet", "Electronics"),
            new Product(17, "Sunglasses", "Accessories"),
            new Product(11, "Pencil Case", "Stationery"),
            new Product(16, "Smartwatch", "Electronics"),
            new Product(13, "Bluetooth Speaker", "Electronics"),
            new Product(20, "Coat", "Fashion"),
            new Product(15, "Backpack", "Travel")
        };
        

        System.out.println("\nSearching for product with ID '16' using linear search");
        searchOperation.linearSearch(16, arr1);
        
        System.out.println("\nSearching for product with ID '22' using linear search");
        searchOperation.linearSearch(22, arr1);

        System.out.println("\nCreating a sorted array of products for binary search");
        
        Product[] arr2 = {
            new Product(11, "Pencil Case", "Stationery"),
            new Product(12, "Tablet", "Electronics"),
            new Product(13, "Bluetooth Speaker", "Electronics"),
            new Product(14, "Desk Lamp", "Home Decor"),
            new Product(15, "Backpack", "Travel"),
            new Product(16, "Smartwatch", "Electronics"),
            new Product(17, "Sunglasses", "Accessories"),
            new Product(19, "Soccer Ball", "Sports"),
            new Product(20, "Coat", "Fashion"),
            new Product(21, "Book", "Education")
        };

        System.out.println("\nSearching for product with ID '19' using binary search");
        searchOperation.binarySearch(19, arr2);
        
        System.out.println("\nSearching for product with ID '22' using binary search");
        searchOperation.binarySearch(22, arr2);
    }
}
