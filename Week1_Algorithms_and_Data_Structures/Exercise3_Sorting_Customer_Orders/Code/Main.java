public class Main {
    public static void main(String[] args) 
    {
        SortOrders sortOrders = new SortOrders();
        
        Order[] orders = {
            new Order(101, "Alice", 250.75),
            new Order(102, "Bob", 540.10),
            new Order(103, "Charlie", 120.50),
            new Order(104, "Diana", 320.40),
            new Order(105, "Evan", 450.00)
        };

        System.out.println("Original Orders:");
        for (Order order : orders) 
        {
            System.out.println(order);
        }

        sortOrders.bubbleSortByTotalPrice(orders);
        System.out.println("\nOrders after Bubble Sort by totalPrice:");
        for (Order order : orders) 
        {
            System.out.println(order);
        }
        
        System.out.println("\nOrder Array is reset to original order");
        sortOrders.bubbleSortByOrderId(orders);
        System.out.println("Original Orders:");
        for (Order order : orders) 
        {
            System.out.println(order);
        }

        sortOrders.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nOrders after Quick Sort by totalPrice:");
        for (Order order : orders) 
        {
            System.out.println(order);
        }
    }
}