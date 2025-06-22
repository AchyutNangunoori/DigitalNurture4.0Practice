public class SearchLibrary 
{
    boolean found;

    public void linearSearch(String title, Book books[]) 
    {
        found = false;
        
        for (Book b : books) 
        {
            if (b.getTitle().equals(title)) 
            {
                found = true;
                System.out.println("Found the book with title: " + title);
                System.out.println(b.toString());
                break;
            }
        }
        
        if (!found) 
        {
            System.out.println("No book with title: " + title);
        }
    }

    public void binarySearch(String title, Book books[]) 
    {
        found = false;
        int left = 0;
        int right = books.length - 1;
        int mid;

        while (left <= right) 
        {
            mid = (left + right) / 2;
            String midTitle = books[mid].getTitle();
            if(midTitle.equals(title)) 
            {
                System.out.println("Book found with title: " + title);
                System.out.println(books[mid].toString());
                found = true;
                break;
            }
            if(midTitle.compareTo(title) > 0) 
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
            System.out.println("No book with title: " + title);
        }
    }
}
