import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {

        System.out.println("Creating a library");
        SearchLibrary searchLibrary = new SearchLibrary();

        System.out.println("Creating books for library");
        Book[] books = new Book[] {
            new Book(1, "Ancient Myths", "Neil Carter"),
            new Book(2, "Brave Hearts", "Lara James"),
            new Book(3, "City Lights", "Ryan George"),
            new Book(4, "Desert Tales", "Amina Khan"),
            new Book(5, "Echoes of Time", "Vinay Sharma"),
            new Book(6, "Falling Leaves", "Emily Tran"),
            new Book(7, "Golden Horizon", "Omar Siddiqui"),
            new Book(8, "Hidden Valleys", "Sophie Lin"),
            new Book(9, "Jungle Book", "Rudyard Kipling"),
            new Book(10, "Kingdom Rise", "Nora Black")
        };
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter book name to search using Linear Search");
        String book1 = sc.nextLine();
        System.out.println("\nSearching for \'"+ book1 + "\' using linear search");
        searchLibrary.linearSearch(book1, books);

        System.out.println("\nEnter book name to search using Binary Search");
        String book2 = sc.nextLine();
        System.out.println("\nSearching for \'"+ book2 + "\' using linear search");
        searchLibrary.linearSearch(book2, books);

    }
}
