public class Main 
{
    public static void main(String[] args) 
    {
        ManageInventory manageInventory = new ManageInventory();
        System.out.println("Created a new inventory");

        System.out.println("\nAdding a new product: Phone");
        manageInventory.addProduct(1, "Phone", 25, 15000);

        System.out.println("Adding another product: Monitor");
        manageInventory.addProduct(2, "Monitor", 8, 12000);

        System.out.println("Adding another product: Speaker");
        manageInventory.addProduct(3, "Speaker", 20, 3000);

        System.out.println("\nProducts in inventory:");
        manageInventory.display();

        System.out.println("\nUpdating the quantity of Phone and price of Monitor");
        manageInventory.updateProductQuantity(1, 30);
        manageInventory.updateProductPrice(2, 11000);

        System.out.println("\nProducts in inventory after update:");
        manageInventory.display();

        System.out.println("\nDeleting Speaker from inventory");
        manageInventory.deleteProduct(3);

        System.out.println("\nProducts in inventory after deletion:");
        manageInventory.display();
    }
}
