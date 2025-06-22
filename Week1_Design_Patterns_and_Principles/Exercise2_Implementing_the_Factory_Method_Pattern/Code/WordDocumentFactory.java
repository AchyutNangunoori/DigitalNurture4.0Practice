public class WordDocumentFactory extends DocumentFactory
{
    public Document createDocument()
    {
        System.out.println("Creating Word Document");
        return new WordDocument();
    }
}