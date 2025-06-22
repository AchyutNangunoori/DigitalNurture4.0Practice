public class Book 
{
    private int bookID;
    private String title;
    private String author;

    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
    }

    public String getTitle() 
    {
        return title;
    }
    
    public String toString() {
        return "Book ID: " + bookID + 
               "\tTitle: " + title + 
               "\tAuthor: " + author;
    }
}
